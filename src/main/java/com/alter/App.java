package com.alter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alter.config.Coefficients;
import com.alter.service.SimpleStaticService;



/**
 * Hello world!
 *
 */
public class App 
{
	protected static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private static String[] fn = null;

    // 初始化spring文档
    private static void contextInitialized() {
        fn = new String[] {"applicationContext.xml"};
    }

    /**
     * @param args
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        contextInitialized();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(fn);

        DisconfDemo task = ctx.getBean("disconfDemo", DisconfDemo.class);

        int ret = task.run();

        System.exit(ret);
        
    }
}
