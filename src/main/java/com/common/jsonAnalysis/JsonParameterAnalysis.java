package com.common.jsonAnalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.common.init.BeanUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

/**
 * 前端传入JSON字符串 解析工具类
 * @author wesion
 *
 */
@Service
public class JsonParameterAnalysis {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BeanUtil beanUtil;
	
	
	/**
	 * 
	 * @param jsonStr 前端传入json字符串 （三层结构）
	 * 	格式： {
				info:{
					"userName": "keyy",
					book1:{
						"name": "book1",
						"id": 1
					},
					book2:{
						"name": "book2",
						"id": 2
					}
		
				}
			}
	 * @param name 需要转化成得bean名称
	 * @return Map<String, Object> 存放解析后的对象
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> parameterAndBeanAnalysis(String jsonStr, String name) {

		// 返回结果
		Map<String, Object> resultMap = new HashMap<>();

		Map<String, Object> map = (Map<String, Object>) JSONObject.parse(jsonStr);

		if (map.entrySet() != null) {
			for (Entry<String, Object> entry : map.entrySet()) {

				Map<String, Object> map2 = (Map<String, Object>) entry.getValue();
				if (map2.entrySet() != null) {
					for (Entry<String, Object> entry2 : map2.entrySet()) {

						if (entry2.getValue() instanceof JSONObject) {
							Map<String, Object> map3 = (Map<String, Object>) entry2.getValue();
							try {
								Object object = beanUtil.getBeanByName(name);
								BeanUtils.populate(object, map3);
								resultMap.put(entry2.getKey(), object);
							} catch (Exception e) {
								e.printStackTrace();
								logger.info("参数对象Map转bean 失败");
							}

						} else {

							resultMap.put(entry2.getKey(), (String) entry2.getValue());
						}
					}
				}

			}
		}

		return resultMap;
	}

}
