package com.wsy.webseed.dao;

import com.wsy.webseed.domain.SysUserRoleVo;

import java.util.List;


public interface SysUserRoleMapper {

    public void save(List<SysUserRoleVo> userRoles);

    public List<SysUserRoleVo> queryByRoleId(Long id);

    public List<SysUserRoleVo> queryByUserId(Long id);
}
