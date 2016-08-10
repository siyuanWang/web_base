package com.wsy.webseed.dao;


import com.wsy.webseed.domain.SysAuthVo;
import com.wsy.webseed.domain.SysRoleVo;

import java.util.List;
import java.util.Map;

public interface SysRoleMapper {
    
    /**
     * 查询SysRole所有记录
     * @return
     */
    public List<SysRoleVo> query();

    /**
     * 通过id查询SysRole
     * @param id
     * @return
     */
    public SysRoleVo query(int id);
    
    /**
     * 将role对象保存到SysRole
     * @param role
     * @return
     */
    public int save(SysRoleVo role);
    
    /**
     * 修改SysRole
     * @param role
     * @return
     */
    public int edit(SysRoleVo role);
    
    /**
     * 根据id删除SysRole
     * @param id
     * @return
     */
    public int del(int id);

    /**
     * 根据name，id查询SysRole
     * @return
     */
    public SysRoleVo query(Map<String, Object> param);

    /**
     * 根据roleId查询SysMenu
     * @param id
     * @return
     */
    public List<SysAuthVo> queryRoleMenusByRoleId(int id);

}
