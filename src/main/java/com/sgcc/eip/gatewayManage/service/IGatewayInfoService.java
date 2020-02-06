package com.sgcc.eip.gatewayManage.service;

import com.sgcc.eip.gatewayManage.entity.GatewayInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 网关信息表 服务类
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
public interface IGatewayInfoService extends IService<GatewayInfo> {

    List<GatewayInfo> selectAll();

}
