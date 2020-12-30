package com.cby.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cby.service.MessageService;

@Controller
@ResponseBody
@RequestMapping("/message")
public class MessageController {
	@Autowired
	MessageService messageService;
	
	@GetMapping("/list")
	private Map<String,Object> list() {
        Map<String,Object> result =new HashMap<String, Object>();
        result.put("code", 20000);
        result.put("data", messageService.messageListByPage(1, 10));
        return result;
	}

}
