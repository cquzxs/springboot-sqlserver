package com.example.springbootsqlserver.entity.bo;
/**
 * @author: xueshan.zeng
 * @date: 2019/8/7
 */
public class BasePage {
    private int pageStart;
    private int pageEnd;

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }
}
