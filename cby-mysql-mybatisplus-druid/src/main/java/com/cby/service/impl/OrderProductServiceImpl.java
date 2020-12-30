package com.cby.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cby.dao.OrderProductDOMapper;
import com.cby.dao.ProductDOMapper;
import com.cby.entity.OrderProductDO;
import com.cby.entity.ProductDO;
import com.cby.service.OrderProductService;

@Service
public class OrderProductServiceImpl implements OrderProductService{
	@Autowired
	private ProductDOMapper productDOMapper;
	@Autowired
	private OrderProductDOMapper orderProductDOMapper;

	@Override
	@Transactional
	public void addOrder(Integer productId) {
		
		ProductDO productDO=this.productDOMapper.selectById(productId);
		
		if(productDO!=null) {
			productDO.setStock(productDO.getStock()-1);
			this.productDOMapper.updateById(productDO);
			OrderProductDO orderProductDO = new OrderProductDO();
			orderProductDO.setProductId(productId);
			orderProductDO.setPrice(productDO.getPrice());
			orderProductDO.setItemCount(1);
			
			/* 设置异常 */
//			int a = 10/0;
			
			/*如果异常被处理 没有向上级@Transactional抛出 那么就相当于没有异常处理*/
			try {
				int a = 10/0;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("************");
				System.out.println(e);
			}
			
			this.orderProductDOMapper.insert(orderProductDO);
			
		}
	}

	@Override
	@Transactional
	public void addOrderWithoutTransectional(Integer productId) {
		//默认情况下事务@Transactional 只对其修饰的方法本身一级抛出的异常有效
		//1.直接调用addOrder 然后addOrderWithoutTransectional上面不添加@Transactional 	事务无效
		//2.直接调用addOrder 然后addOrderWithoutTransectional上面添加@Transactional 	事务无效
		this.addOrder(productId);
		
	}
	
}
