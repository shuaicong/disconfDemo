package com.alter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alter.config.Coefficients;
import com.alter.config.GlobalCache;
import com.alter.service.AutoService;
import com.alter.service.AutoService2;
import com.alter.service.BaoBaoService;
import com.alter.service.SimpleRedisService;
import com.alter.service.SimpleStaticService;
import com.alter.utils.JedisConfig;




@Service
public class DisconfDemo {
	 protected static final Logger LOGGER = LoggerFactory.getLogger(DisconfDemo.class);
	 
	 @Autowired
     private SimpleRedisService simpleRedisService;
	 
	 @Autowired
     private JedisConfig jedisConfig;
	 
	 @Autowired
	 private Coefficients coefficients;
	 
	 @Autowired
	 private BaoBaoService baoBaoService;
	 
	 @Autowired
     private AutoService autoService;

     @Autowired
     private AutoService2 autoService2;
	 
	 private static final String REDIS_KEY = "disconf_key";
	 
	 @Autowired
     private GlobalCache globalCache;
	 
	 

	    /**
	     *
	     */
	    public int run() {

	        try {

	            while (true) {

	                Thread.sleep(5000);

	                LOGGER.info("redis( " + jedisConfig.getHost() + ","
	                        + jedisConfig.getPort() + ")  get key: " + REDIS_KEY);
	                
	                LOGGER.info("金融系数文件 :"+  coefficients.getDiscount());
	                
	                LOGGER.info("投资的钱 :"+  baoBaoService.getMoneyInvest());
	                
	                LOGGER.info("!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@static file data:" + SimpleStaticService.getStaticFileData());

	                LOGGER.info("静态配置项 使用示例:" + SimpleStaticService.getStaticItem());
	                
	                LOGGER.info("@@@@@@@@@@@@autoservice: {}", autoService.getAuto());

	                LOGGER.info("@@@@@@@@@@@@@@autoservice2: {}", autoService2.getAuto2());
	                
	                LOGGER.info("@@@@@@@@@@@@@@GlobalCache: ", globalCache.getCornet());
	            }

	        } catch (Exception e) {

	            LOGGER.error(e.toString(), e);
	        }

	        return 0;
	    }
}
