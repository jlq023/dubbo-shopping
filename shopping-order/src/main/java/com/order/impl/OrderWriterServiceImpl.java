package com.order.impl;

import com.bean.OrderBean;
import com.service.order.OrderWriterService;
 

public class OrderWriterServiceImpl implements OrderWriterService {

	@Override
	public boolean save(OrderBean bean) {
		// TODO Auto-generated method stub
		System.out.println("订单增加成功");
		return true;
	}

	@Override
	public boolean edit(OrderBean bean) {
		// TODO Auto-generated method stub
		System.out.println("订单修改成功");
		return true;
	}

}
