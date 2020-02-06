package com.sgcc.eip.systemManage.mapper;

import com.sgcc.eip.systemManage.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@Repository
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    List<UserInfo> selectAll();
}
