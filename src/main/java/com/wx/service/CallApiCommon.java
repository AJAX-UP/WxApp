package com.wx.service;
import com.common.net.RedirectConstants;
import com.common.net.RequestHttpPorxy;
import com.common.net.ReturnMsg;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CallApiCommon {
	public static final String TARGET_URL = RedirectConstants.THEAPIURL;
	public JSONObject requestActionParams(String apiName, JSONObject params) {
		JSONObject res = null;
		try {
			params.put("T", "0");
			params.put("V", "1.0.0");
			params.put("TX", apiName);
			params.put("D", "wechat");
			res = RequestHttpPorxy.requestPorxy(params,TARGET_URL);
		} catch(Exception e) {
			String resStr = "{\"R\":" + ReturnMsg.NET_BUSY + ",\"I\":\"" + ReturnMsg.NET_BUSY_MSG
					+ "\"}";
			res = JSONObject.fromObject(resStr);
		}
		return res;
	}

	/*public JSONObject requestActionParamsApp(String apiName, JSONObject params) {
		JSONObject res = null;
		try {
			params.put("T", "0");
			params.put("V", "1.0.0");
			params.put("TX", apiName);
			params.put("D", "app");
			res = RequestHttpPorxy.requestPorxy(params,"http://test.bdkq.ucmed.cn/api/exec/1.htm");
		} catch(Exception e) {
			String resStr = "{\"R\":" + ReturnMsg.NET_BUSY + ",\"I\":\"" + ReturnMsg.NET_BUSY_MSG
					+ "\"}";
			res = JSONObject.fromObject(resStr);
		}
		return res;
	}*/
}
