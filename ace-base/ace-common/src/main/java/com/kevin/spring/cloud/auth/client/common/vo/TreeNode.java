package com.kevin.spring.cloud.auth.client.common.vo;

import java.util.ArrayList;
import java.util.List;

/**
 *树的结点
 */
public class TreeNode {

    private int id;
    private int parentId;
    private List<TreeNode> children = new ArrayList<>();

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void add(TreeNode node) {
        children.add(node);
    }


}
