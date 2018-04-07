package com.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.service.order.OrderReadService;
import com.service.order.OrderWriterService;

@Controller
@RequestMapping("/pay")
public class PayController {
	
	@RequestMapping("/orderRead")
	@ResponseBody
	public String orderRead(long id) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("msg", orderReadService.getOrder(id));
		return jsonObj.toJSONString();
	}

	@RequestMapping("/orderList")
	@ResponseBody
	public String orderList(long id) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("msg", orderReadService.listQuery());
		return jsonObj.toJSONString();
	}

	@RequestMapping("/orderEdit")
	@ResponseBody
	public String edit() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("msg", orderWriterService.edit(null));
		return jsonObj.toJSONString();
	}

	@RequestMapping("/orderSave")
	@ResponseBody
	public String save() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("msg", orderWriterService.save(null));
		return jsonObj.toJSONString();
	}

	@Autowired
	private OrderWriterService orderWriterService;

	@Autowired
	private OrderReadService orderReadService;
}
