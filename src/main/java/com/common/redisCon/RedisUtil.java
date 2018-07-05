package com.common.redisCon;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.wx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service("redisUtil")
public class RedisUtil {

	@Autowired
	private RedisTemplate<String, Serializable> redisTemplate;

	// hash put
	public void hashPut(String key, String filed, Serializable object) {
		redisTemplate.opsForHash().put(key, filed, object);
	}

	@SuppressWarnings("unchecked")
	public <T extends Serializable> List<T> hashGetAll(String key) {
		return (List)redisTemplate.opsForList().range(key,0,-1);
	}

	// delete
	public void delete(String key) {
		redisTemplate.delete(key);
	}

	// object get
	public Serializable putList(String key ,List list) {
		return redisTemplate.opsForList().leftPushAll(key,list);
	}

}

