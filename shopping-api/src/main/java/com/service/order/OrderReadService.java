package com.service.order;

import java.util.List;

import com.bean.OrderBean;

/**
 * 订单查询
 * */
public interface OrderReadService {
	
	List<OrderBean> listQuery();

	OrderBean getOrder(long oId);
}
