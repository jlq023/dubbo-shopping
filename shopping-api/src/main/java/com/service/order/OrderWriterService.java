package com.service.order;

import com.bean.OrderBean;
/**
 * 订单增加,修改
 * */
public interface OrderWriterService {
	boolean save(OrderBean bean);
	boolean edit(OrderBean bean);
}
