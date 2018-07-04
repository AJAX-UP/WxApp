package com.common.redisCon;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("redisUtil")
public class RedisUtil {

	@Autowired
	private RedisTemplate<String, Serializable> redisTemplate;

	// hash put
	public void hashPut(String key, String filed, Serializable object) {
		redisTemplate.opsForHash().put(key, filed, object);
	}
	// hash put
	public void Put(String key, Serializable object) {
		redisTemplate.opsForValue().set(key, object);
	}
	
	// object get
	public Serializable getByKey(String key) {
		return redisTemplate.opsForValue().get(key);
	}

}
