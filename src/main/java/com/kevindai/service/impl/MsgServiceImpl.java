package com.kevindai.service.impl;

import com.kevindai.service.MsgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Service("msgService")
public class MsgServiceImpl implements MsgService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MsgServiceImpl.class);
    @Override
    public String sendMsg(String s) {
        LOGGER.debug("get msg:" + s);
        return s + " i get it!";
    }
}
