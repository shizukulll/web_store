package com.huat.dao;

import java.util.List;

import com.huat.po.OrderForm;

public interface OrderFormDao {
	public void save(OrderForm orderForm);
	public void delete(OrderForm orderForm);
	public OrderForm findOrderFormById(int id);
	public List<OrderForm> findAllOrderForms();
	public void update(OrderForm orderForm);
	public OrderForm queryOrderForm(int orderFormId);
	public List<OrderForm> findOrderFormByUserName(String username);
	
}
