package com.wsy.webseed.dao;


import com.wsy.webseed.domain.SysAuthVo;

import java.util.List;
import java.util.Map;

public interface SysMenuMapper {
	public List<SysAuthVo> query(Map<String, Object> param);

	public List<SysAuthVo> query(List<Integer> menuIds);
	
	public Integer queryCount();
	
	public Integer save(SysAuthVo menu);
}
