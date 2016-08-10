package com.wsy.webseed.service;

import com.wsy.webseed.domain.SysAuthVo;

import java.util.List;

public interface SysAuthService {
	/**
	 * 查询用户权限
	 * @param loginName 用户登陆名
	 * @return
	 */
	public List<SysAuthVo> queryByLoginName(String loginName);

	/**
	 * 查询角色权限
	 * @param role 角色名称
	 * @return
	 */
	public SysAuthVo queryByRole(String role);

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public SysAuthVo queryById(Long id);

	/**
	 * 保存权限
	 * @param vo
	 */
	public void save(SysAuthVo vo);

	/**
	 * 修改权限
	 * @param vo
	 */
	public void update(SysAuthVo vo);

	/**
	 * 删除权限
	 * @param id
	 */
	public void del(Long id);
}
