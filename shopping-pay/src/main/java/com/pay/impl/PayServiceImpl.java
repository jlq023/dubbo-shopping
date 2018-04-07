package com.pay.impl;

import com.service.pay.PayService;
 

public class PayServiceImpl implements PayService {

	@Override
	public String pay(long orderId) {
		// TODO Auto-generated method stub
		return orderId + "支付成功.";
	}

}
