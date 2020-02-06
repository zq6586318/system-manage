package com.sgcc.eip.gatewayManage.service.impl;

import com.sgcc.eip.gatewayManage.entity.GatewayInfo;
import com.sgcc.eip.gatewayManage.mapper.GatewayInfoMapper;
import com.sgcc.eip.gatewayManage.service.IGatewayInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 网关信息表 服务实现类
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@Service
public class GatewayInfoServiceImpl extends ServiceImpl<GatewayInfoMapper, GatewayInfo> implements IGatewayInfoService {
    @Autowired
    GatewayInfoMapper gatewayInfoMapper;

    @Override
    public List<GatewayInfo> selectAll() {
        return gatewayInfoMapper.selectAll();
    }
}
