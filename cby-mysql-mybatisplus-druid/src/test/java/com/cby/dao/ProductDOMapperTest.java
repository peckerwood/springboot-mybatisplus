package com.cby.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cby.entity.ProductDO;
@SpringBootTest
class ProductDOMapperTest {
	@Autowired
	ProductDOMapper productDOMapper;

	@Test
	void test() {
		ProductDO productDO = new ProductDO();
		productDO.setName("computer");
		productDO.setDescription("computer description");
		productDO.setPrice(new BigDecimal("20.2"));
		productDO.setStock(1000);
		
		productDOMapper.insert(productDO);
		
	}

}
