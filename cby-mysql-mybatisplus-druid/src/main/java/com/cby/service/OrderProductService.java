package com.cby.service;


public interface OrderProductService {
	
	public void addOrder(Integer productId);
	public void addOrderWithoutTransectional(Integer productId);

}
