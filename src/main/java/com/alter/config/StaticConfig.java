package com.alter.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

/**
 * @描述: 静态 配置文件 示例
 * @作者: alter
 * @时间：2017-6-9 下午2:49:37
 */
@DisconfFile(filename = "static.properties")
public class StaticConfig {
	private static int staticVar;

    @DisconfFileItem(name = "staticVar", associateField = "staticVar")
    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        StaticConfig.staticVar = staticVar;
    }
}
