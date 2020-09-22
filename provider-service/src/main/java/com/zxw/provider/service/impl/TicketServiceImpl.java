package com.zxw.provider.service.impl;

import com.zxw.provider.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description: 将服务发布出去(这里Service是Dubbo的包)
 * @Author Zhouxw
 * @Date 2020/8/7 0007 10:24
 **/
@Service
@Component
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "这里是provider-service，票已发放，时间：" + new Date();
    }
}
