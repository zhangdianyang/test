package com.zhangdianyang.testElasticSearch.services;

import com.zhangdianyang.testElasticSearch.dao.myuser;
import com.zhangdianyang.testElasticSearch.entity.MyUser;

import java.util.List;
import java.util.Map;

public interface MyUserServiceInt {
    List<MyUser> findmyuser(Map<String,Object> map);

}
