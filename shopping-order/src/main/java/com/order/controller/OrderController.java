package com.order.controller;

import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject; 
import com.service.pay.PayService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/pay")
	@ResponseBody
	public String payTest(long id) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("msg", payService.pay(id));
		return jsonObj.toJSONString();
	}

	@Autowired
	private PayService payService;
}
