package com.kevindai.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kevindai.service.MsgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Service(version = "1.0.0")
public class MsgServiceImpl implements MsgService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MsgServiceImpl.class);
    @Override
    public String sendMsg(String s) {
        LOGGER.debug("get msg:" + s);
        return s + " i get it!";
    }
}
