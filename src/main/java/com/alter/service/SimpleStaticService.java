package com.alter.service;

import com.alter.config.StaticConfig;
import com.baidu.disconf.client.common.annotations.DisconfItem;

/**
 * @描述:使用静态配置文件的示例
 * @作者: alter
 * @时间：2017-6-9 下午2:49:50
 */
public class SimpleStaticService {
	private static int staticItem = 56;

    /**
     *
     * @return
     */
    public static int getStaticFileData() {

        return StaticConfig.getStaticVar();
    }
    
    @DisconfItem(key = "staticItem")
    public static int getStaticItem() {
        return staticItem;
    }

    public static void setStaticItem(int staticItem) {
        SimpleStaticService.staticItem = staticItem;
    }
    
}
