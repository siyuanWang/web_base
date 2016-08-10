package com.wsy.webseed.dao;

import com.wsy.webseed.domain.SysRoleVo;
import com.wsy.webseed.domain.SysUserVo;

import java.util.List;
import java.util.Map;


public interface SysUserMapper {

    /**
     * @return
     */
    public SysUserVo query(Map<String, Object> param);
    
    /**
     * 将sysUser对象保存到SysUser
     * @param sysUser
     * @return
     */
    public int save(SysUserVo sysUser);
    
    /**
     * 修改SysUser
     * @param user
     * @return
     */
    public int edit(SysUserVo user);
    
    /**
     * 根据id删除SysUser
     * @param id
     * @return
     */
    public int del(int id);

    /**
     * 根据userId查询SysRole
     * @param id
     * @return
     */
    public List<SysRoleVo> queryRolesByUserId(int id);
    /**
     * 查询总记录数
     * @return
     */
    public Integer queryCount();
}
