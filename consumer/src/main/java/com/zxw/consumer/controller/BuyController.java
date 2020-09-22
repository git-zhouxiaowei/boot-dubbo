package com.zxw.consumer.controller;

import com.zxw.consumer.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 测试入口
 * @Author Zhouxw
 * @Date 2020/8/7 0007 14:57
 **/
@RestController
public class BuyController {

    @Resource
    UserService userService;

    @RequestMapping("buy")
    public String buy() {
        return userService.buyTicket();
    }
}
