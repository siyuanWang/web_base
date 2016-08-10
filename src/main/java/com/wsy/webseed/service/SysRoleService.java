package com.wsy.webseed.service;

import com.wsy.webseed.domain.SysRoleVo;

import java.util.List;

public interface SysRoleService {

    /**
     * 将role对象保存到SysRole
     * @param role
     */
    public void save(SysRoleVo role);

    /**
     * 根据id查询SysRole
     * @param id
     * @return
     */
    public SysRoleVo query(Long id);
    
    /**
     * 查询SysRole的所有信息
     * @return
     */
    public List<SysRoleVo> query();

    /**
     * 根据loginName查询所有的角色
     * @param loginName
     * @return
     */
    public List<SysRoleVo> query(String loginName);
    
    /**
     * 修改SysRole
     * @param role
     */
    public void update(SysRoleVo role);
    
    /**
     * 根据id删除SysRole
     * @param id
     */
    public void del(Long id);
}
