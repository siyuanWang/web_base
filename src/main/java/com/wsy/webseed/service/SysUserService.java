package com.wsy.webseed.service;

import java.util.List;
import com.wsy.webseed.domain.SysRoleVo;
import com.wsy.webseed.domain.SysUserVo;
import com.wsy.webseed.util.Pagination;

public interface SysUserService {
    
    /**
     * 将sysUser保存到SysUser
     * @param sysUser
     */
    public void saveUser(SysUserVo sysUser);

    /**
     * 根据id查询SysUser
     * @param id
     * @return
     */
    public SysUserVo query(int id);
    
    /**
     * 查询所有SysUser
     * @return
     */
    public List<SysUserVo> query();
    /**
     * 查询SysUser的JSON
     * @return
     */
    public String queryTableJson(Pagination<SysUserVo> pagination);
    
    /**
     * 修改SysUser
     * @param user
     * @param id
     */
    public void edit(SysUserVo user,int id);
    
    /**
     * 根据id删除SysUser
     * @param id
     */
    public void del(int id);
    
    /**
     * 用户的角色授权
     * @param userId
     * @param roleIds
     */
    public void updateUserRole(int userId, Integer[] roleIds);
    
    /**
     * 根据userId查询SysRole
     * @param id
     * @return
     */
    public List<SysRoleVo> queryRolesByUserId(int id);


    /**
     * 根据loginName查询SysUser
     * @param loginName
     * @return
     */
    public SysUserVo query(String loginName);

    /**
     * 根据loginId和password修改SysUser密码
     * @param loginName
     * @param password
     * @return
     */
    public int queryEditPwd(String loginName, String password);
}
