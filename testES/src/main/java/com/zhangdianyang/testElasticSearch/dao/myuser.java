package com.zhangdianyang.testElasticSearch.dao;

import com.zhangdianyang.testElasticSearch.entity.MyUser;

import java.util.List;
import java.util.Map;

public interface myuser {
    List<MyUser> findMyUser(Map<String,Object> map);
}
