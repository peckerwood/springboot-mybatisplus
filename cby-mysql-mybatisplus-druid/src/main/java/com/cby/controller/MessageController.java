package com.cby.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cby.entity.MessageDO;
import com.cby.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Autowired
	MessageService messageService;
	
	@GetMapping("/list")
	@ResponseBody
	private Map<String,Object> list() {
        Map<String,Object> result =new HashMap<String, Object>();
        result.put("code", 20000);
        result.put("data", messageService.messageListByPage(1, 10));
        return result;
	}
	@GetMapping("/listforlayui")
	@ResponseBody
	private Map<String,Object> listforlayui(@RequestParam(name = "page") Integer page,@RequestParam(name = "limit") Integer limit) {
        Map<String,Object> result =new HashMap<String, Object>();
        IPage<MessageDO> dataIPage =messageService.messageListByPage(page, limit);
        
        result.put("code", 0);
        result.put("count", dataIPage.getTotal());
        result.put("data", dataIPage.getRecords());
        return result;
	}
	
	@GetMapping(value = {"index","index/","/index/{page}"})
	private ModelAndView getMessages(@PathVariable(name="page",required = false) Integer page) {
		
		if(page==null) {
			page = 1;
		}
		
        Map<String,Object> result =new HashMap<String, Object>();
        result.put("code", 20000);
        IPage<MessageDO> dataIPage =messageService.messageListByPage(page, 10);
        result.put("data", dataIPage);
        List<Long> pager = new ArrayList<>();
        long pageArea = 5;
        long prePage = dataIPage.getCurrent()-pageArea;
        long nextPage = dataIPage.getCurrent()+pageArea;
        if(prePage<=0) {
        	nextPage -=prePage;
        	prePage = 1;
        }
        if(nextPage>dataIPage.getPages()) {
        	nextPage = dataIPage.getPages();
        }
        for(long i=prePage;i<=nextPage;i++) {
        	pager.add(i);
        }

        result.put("pager", pager);
		
		ModelAndView mv = new ModelAndView();
		mv.addAllObjects(result);
        mv.addObject("title", "消息列表");
        mv.addObject("description", "测试消息列表thymeleaf模版显示！");
        
        mv.setViewName("/thymeleaf/message/index.html");
       
        return mv;
		
	}
	@GetMapping(value = {"show","show/","/show/{page}"})
	private ModelAndView getMessageList(@PathVariable(name="page",required = false) Integer page) {
		
		if(page==null) {
			page = 1;
		}
		
        Map<String,Object> result =new HashMap<String, Object>();
        result.put("code", 20000);
        IPage<MessageDO> dataIPage =messageService.messageListByPage(page, 10);
        result.put("data", dataIPage);
        List<Long> pager = new ArrayList<>();
        long pageArea = 5;
        long prePage = dataIPage.getCurrent()-pageArea;
        long nextPage = dataIPage.getCurrent()+pageArea;
        if(prePage<=0) {
        	nextPage -=prePage;
        	prePage = 1;
        }
        if(nextPage>dataIPage.getPages()) {
        	nextPage = dataIPage.getPages();
        }
        for(long i=prePage;i<=nextPage;i++) {
        	pager.add(i);
        }

        result.put("pager", pager);
		
		ModelAndView mv = new ModelAndView();
		mv.addAllObjects(result);
        mv.addObject("title", "消息列表");
        mv.addObject("description", "测试消息列表thymeleaf模版显示！");
        mv.addObject("logo", "layui 后台布局 ^-^");
        mv.setViewName("/thymeleaf/layui/index.html");
        return mv;
		
	}
	
}
