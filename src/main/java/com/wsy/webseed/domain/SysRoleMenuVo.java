package com.wsy.webseed.domain;


import com.wsy.webseed.domain.entity.SysRoleAuth;

import java.util.Date;

public class SysRoleMenuVo extends SysRoleAuth implements java.io.Serializable {

	private int id;
	private int roleId;
	private int menuId;
	private Date updateTime;
	private Date createTime;

	public SysRoleMenuVo() {
	}

	public SysRoleMenuVo(int id, int roleId, int menuId, Date updateTime,
						 Date createTime) {
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
