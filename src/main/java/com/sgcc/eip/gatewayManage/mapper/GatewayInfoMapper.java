package com.sgcc.eip.gatewayManage.mapper;

import com.sgcc.eip.gatewayManage.entity.GatewayInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 网关信息表 Mapper 接口
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@Mapper
@Repository
public interface GatewayInfoMapper extends BaseMapper<GatewayInfo> {

    List<GatewayInfo> selectAll();

}
