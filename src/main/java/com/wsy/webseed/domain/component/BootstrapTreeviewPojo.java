package com.wsy.webseed.domain.component;

import java.io.Serializable;
import java.util.List;

/**
 * 对应前端的bootstrap-treeview
 *
 * @author wangsy
 */
public class BootstrapTreeviewPojo implements Serializable {
    private static final long serialVersionUID = -3393229039591335016L;

    private String text;
    private String icon = "entypo-search";
    private boolean active;
    private List<BootstrapTreeviewPojo> children;
    private boolean hasChildren;
    private String href;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<BootstrapTreeviewPojo> getChildren() {
        return children;
    }

    public void setChildren(List<BootstrapTreeviewPojo> children) {
        this.children = children;
    }
}
