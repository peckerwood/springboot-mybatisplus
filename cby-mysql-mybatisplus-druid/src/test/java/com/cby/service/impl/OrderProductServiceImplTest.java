package com.cby.service.impl;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cby.service.OrderProductService;

@SpringBootTest
class OrderProductServiceImplTest {
	@Autowired
	OrderProductService orderProductService;

	@Test
	void testAddOrder() {
		orderProductService.addOrder(1);
	}
	@Test
	void testAddOrderWithoutTransectional() {
		orderProductService.addOrderWithoutTransectional(1);
	}

}
