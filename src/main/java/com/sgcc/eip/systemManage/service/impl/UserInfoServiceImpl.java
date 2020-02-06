package com.sgcc.eip.systemManage.service.impl;

import com.sgcc.eip.systemManage.entity.UserInfo;
import com.sgcc.eip.systemManage.mapper.UserInfoMapper;
import com.sgcc.eip.systemManage.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }
}
