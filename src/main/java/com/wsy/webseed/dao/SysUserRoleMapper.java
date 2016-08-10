package com.wsy.webseed.dao;

import com.wsy.webseed.domain.SysUserRoleVo;

import java.util.List;


public interface SysUserRoleMapper {

    /**
     * 将userRoles保存到SysUserRole
     * @param userRoles
     */
    public void save(List<SysUserRoleVo> userRoles);

    /**
     * 根据roleId查询SysUserRole
     * @param id
     * @return
     */
    public List<SysUserRoleVo> queryByRoleId(int id);

    /**
     * 根据UserId删除SysUserRole
     * @param id
     */
    public void deleteByUserId(int id);

    /**
     * 根据UserId查询SysUserRole
     * @param id
     * @return
     */
    public List<SysUserRoleVo> queryByUserId(int id);
}
