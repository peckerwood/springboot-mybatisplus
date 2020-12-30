package com.cby.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cby.entity.MessageDO;

@SpringBootTest
class MessageServiceTest {

	@Autowired
	MessageService messageService;
	@Test
	void test() {
		IPage<MessageDO> iPage = this.messageService.messageListByPage(1, 5);
		System.out.println(JSONObject.toJSON(iPage));
	}

}
