package com.cby.dao;


import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cby.entity.MessageDO;

@SpringBootTest
class MessageDOMapperTest {
	@Autowired
	private MessageDOMapper mapper;

	@Test
	void test() {
		List<MessageDO> list = mapper.selectList(null);
		for (MessageDO messageDO : list) {
			System.out.println(messageDO.toString());
		}
	}
	@Test
	void testInsert() {

		for(int i=0;i<100;i++) {
			MessageDO messageDO = new MessageDO();
			messageDO.setMessage("hello"+i);
			mapper.insert(messageDO);
		}

	}

}
