package com.order.impl;

import java.util.List;
import java.util.Random;
import java.util.Vector;

import com.bean.OrderBean;
import com.service.order.OrderReadService;
  
/**
 * 订单查询实现类
 * */
public class OrderReadServiceImpl implements OrderReadService {

	@Override
	public List<OrderBean> listQuery() {
		// TODO Auto-generated method stub
		List<OrderBean> list = new Vector<OrderBean>();
		for(int i=0;i<5;i++){
			OrderBean bean = new OrderBean();
			bean.setoId(i+10);
			bean.setoMoney(100+new Random().nextInt(50));
			bean.setoUserId(500+new Random().nextInt(50));
			list.add(bean);
		}
		return list;
	}

	@Override
	public OrderBean getOrder(long oId) {
		// TODO Auto-generated method stub
		OrderBean bean = new OrderBean();
		bean.setoId(oId);
		bean.setoMoney(100+new Random().nextInt(50));
		bean.setoUserId(500+new Random().nextInt(50));
		return bean;
	}

}
