package com.wsy.webseed.dao;

import com.wsy.webseed.domain.SysRoleMenuVo;

import java.util.List;

public interface SysRoleMenuMapper {

    //public void save(Set<SysRoleMenu> sysRoleMenus);

    /**
     * 通过roleId删除SysRoleMenu
     * @param id
     */
    public void delByRoleId(int id);

    /**
     * 将roleMenus集合保存到SysRoleMenu
     * @param roleMenus
     */
    public void save(List<SysRoleMenuVo> roleMenus);

    /**
     * 通过roleId查询SysRoleMenu
     * @param id
     * @return
     */
    public List<SysRoleMenuVo> queryByRoleId(int id);
    
    /**
     * 通过roleId的集合，查询SysRoleMenu
     * @param ids
     * @return
     */
    public List<SysRoleMenuVo> queryByRoleIds(List<Integer> ids);
}
