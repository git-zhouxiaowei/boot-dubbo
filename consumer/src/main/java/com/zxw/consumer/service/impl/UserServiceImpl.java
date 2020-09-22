package com.zxw.consumer.service.impl;

import com.zxw.consumer.service.UserService;
import com.zxw.provider.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Description: 实现类
 * @Author Zhouxw
 * @Date 2020/8/7 0007 14:55
 **/
@Service
public class UserServiceImpl implements UserService {
    @Reference
    TicketService ticketService;

    @Override
    public String buyTicket() {
        return ticketService.getTicket();
    }
}
