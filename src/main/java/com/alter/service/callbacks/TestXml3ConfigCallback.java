package com.alter.service.callbacks;

import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

@Service
@DisconfUpdateService(confFileKeys = {"testXml3.xml"})
public class TestXml3ConfigCallback implements IDisconfUpdate {

    public void reload() throws Exception {

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@testXml3  :now i'm at xml update callback ");
    }

}
