package com.cby.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cby.entity.MessageDO;

public interface MessageService {
	
	public IPage<MessageDO> messageListByPage(Integer page,Integer pageSize);

}
