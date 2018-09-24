package com.hrg.actuatordemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisDao {

	@Autowired
	private RedisTemplate stringRedisTemplate;
	
	public void setKey(String key, String value) {
		
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		ops.set(key, value);		
	}
	
	public Object getValue(String key) {
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		return ops.get(key);
		
		
	}
}
