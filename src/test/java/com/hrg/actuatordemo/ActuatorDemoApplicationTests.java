package com.hrg.actuatordemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class ActuatorDemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private RedisDao redisDao;
	
	@Test
	public void testRedis() {
		
		redisDao.setKey("3", "haorengao3");
		System.out.println(redisDao.getValue("3"));
		
	}

}
