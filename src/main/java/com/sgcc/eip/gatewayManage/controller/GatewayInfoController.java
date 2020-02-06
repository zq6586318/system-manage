package com.sgcc.eip.gatewayManage.controller;


import com.sgcc.eip.common.result.ServerResponse;
import com.sgcc.eip.gatewayManage.entity.GatewayInfo;
import com.sgcc.eip.gatewayManage.service.IGatewayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 网关信息表 前端控制器
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@RestController
@RequestMapping("/gatewayManage")
public class GatewayInfoController {

    @Autowired
    IGatewayInfoService gatewayInfoService;

    @GetMapping("/test")
    public ServerResponse test(){
        List<GatewayInfo> lists =  gatewayInfoService.selectAll();
        return ServerResponse.createBySuccess(lists);
    }

}

