package com.sgcc.eip.systemManage.controller;


import com.sgcc.eip.common.result.ServerResponse;
import com.sgcc.eip.systemManage.entity.UserInfo;
import com.sgcc.eip.systemManage.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@RestController
@RequestMapping("/systemManage/")
public class UserInfoController {

    @Autowired
    IUserInfoService userInfoService;

    @GetMapping("/test")
    public ServerResponse test(){
        List<UserInfo> list = userInfoService.selectAll();
        return ServerResponse.createBySuccess(list);
    }

}

