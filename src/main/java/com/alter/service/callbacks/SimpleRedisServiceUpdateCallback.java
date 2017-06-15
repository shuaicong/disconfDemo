package com.alter.service.callbacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alter.service.SimpleRedisService;
import com.alter.utils.JedisConfig;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.alter.config.Coefficients;

/**
 * @描述: 更新Redis配置时的回调函数
 * @作者: alter
 * @时间：2017-6-9 上午10:17:48
 */
@Service
@Scope("singleton")
@DisconfUpdateService(classes = {JedisConfig.class}, itemKeys = { Coefficients.key })
public class SimpleRedisServiceUpdateCallback implements IDisconfUpdate  {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SimpleRedisServiceUpdateCallback.class);
	
	@Autowired
    private SimpleRedisService simpleRedisService;
	
	public void reload() throws Exception {
		System.out.println("回调类调用开始");
		simpleRedisService.changeJedis();
		System.out.println("回调类调用结束");
		System.out.println("~~~~~~~~~"+Coefficients.key);
	}

}
