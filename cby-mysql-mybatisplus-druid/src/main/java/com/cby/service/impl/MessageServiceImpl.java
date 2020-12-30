package com.cby.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cby.dao.MessageDOMapper;
import com.cby.entity.MessageDO;
import com.cby.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	@Autowired
	private MessageDOMapper messageDOMapper;

	@Override
	public IPage<MessageDO> messageListByPage(Integer page, Integer pageSize) {
		
		Page<MessageDO> pageObj = new Page<>(page, pageSize);
		QueryWrapper<MessageDO> queryWrapper = new QueryWrapper<>();
		queryWrapper.gt("id", 10);
		IPage<MessageDO> iPage = this.messageDOMapper.selectPage(pageObj, queryWrapper);
		return iPage;
	}
}
