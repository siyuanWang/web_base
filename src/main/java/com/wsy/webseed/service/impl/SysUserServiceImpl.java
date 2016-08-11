package com.wsy.webseed.service.impl;

import com.wsy.webseed.dao.SysUserMapper;
import com.wsy.webseed.domain.SysRoleVo;
import com.wsy.webseed.domain.SysUserVo;
import com.wsy.webseed.service.SysUserService;
import com.wsy.webseed.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangsiyuan1 on 2016/8/11.
 */
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public void saveUser(SysUserVo sysUser) {

    }

    @Override
    public SysUserVo query(Long id) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        List<SysUserVo> list = sysUserMapper.query(param);
        if(list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<SysUserVo> query() {
        return sysUserMapper.query(new HashMap<String, Object>());
    }

    @Override
    public String queryTableJson(Pagination<SysUserVo> pagination) {
        return null;
    }

    @Override
    public void edit(SysUserVo user, int id) {

    }

    @Override
    public void del(int id) {

    }

    @Override
    public void updateUserRole(int userId, Integer[] roleIds) {

    }

    @Override
    public List<SysRoleVo> queryRolesByUserId(int id) {
        return null;
    }

    @Override
    public SysUserVo query(String loginName) {
        return null;
    }

    @Override
    public int queryEditPwd(String loginName, String password) {
        return 0;
    }
}
