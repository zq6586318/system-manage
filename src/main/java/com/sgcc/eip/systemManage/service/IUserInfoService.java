package com.sgcc.eip.systemManage.service;

import com.sgcc.eip.systemManage.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
public interface IUserInfoService extends IService<UserInfo> {

    List<UserInfo> selectAll();

}
