package com.zhangdianyang.testElasticSearch.entity;

import java.io.Serializable;

public class MyUser implements Serializable {
    private long id;
    private String rentplan;
    private String pricename;
    private String month;
    private String userdep;
    private String userfour;
    private String userfive;
    private String usersix;
    private int count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRentplan() {
        return rentplan;
    }

    public void setRentplan(String rentplan) {
        this.rentplan = rentplan;
    }

    public String getPricename() {
        return pricename;
    }

    public void setPricename(String pricename) {
        this.pricename = pricename;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUserdep() {
        return userdep;
    }

    public void setUserdep(String userdep) {
        this.userdep = userdep;
    }

    public String getUserfour() {
        return userfour;
    }

    public void setUserfour(String userfour) {
        this.userfour = userfour;
    }

    public String getUserfive() {
        return userfive;
    }

    public void setUserfive(String userfive) {
        this.userfive = userfive;
    }

    public String getUsersix() {
        return usersix;
    }

    public void setUsersix(String usersix) {
        this.usersix = usersix;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
