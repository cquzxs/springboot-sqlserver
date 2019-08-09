package com.example.springbootsqlserver.entity.dto;

/**
 * @author: xueshan.zeng
 * @date: 2019/8/9
 */
public class UserInfoParamsDTO {
    private String pageIndex;
    private String pageSize;
    private String fetchAll;


    public UserInfoParamsDTO() {
    }

    public UserInfoParamsDTO(String pageIndex, String pageSize, String fetchAll) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.fetchAll = fetchAll;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getFetchAll() {
        return fetchAll;
    }

    public void setFetchAll(String fetchAll) {
        this.fetchAll = fetchAll;
    }

    @Override
    public String toString() {
        return "UserInfoParamsDTO{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", fetchAll=" + fetchAll +
                '}';
    }
}
