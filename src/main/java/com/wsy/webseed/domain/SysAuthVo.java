package com.wsy.webseed.domain;

import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.wsy.webseed.domain.entity.SysAuth;
import com.wsy.webseed.util.PaginationRow;

import java.util.List;

public class SysAuthVo extends SysAuth implements java.io.Serializable, PaginationRow {
    private static final long serialVersionUID = -4928090824649463747L;

    private boolean hasChild = false;
    private List<SysAuthVo> childList;

    public SysAuthVo() {
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public List<SysAuthVo> getChildList() {
        return childList;
    }

    public void setChildList(List<SysAuthVo> childList) {
        this.childList = childList;
    }

    @Override
    public SimplePropertyPreFilter getSimplePropertyPreFilter() {
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(SysAuthVo.class, "id", "pid", "name", "url",
                "updateTime", "createTime");
        return filter;
    }

}
