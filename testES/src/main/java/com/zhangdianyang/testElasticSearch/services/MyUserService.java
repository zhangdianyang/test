package com.zhangdianyang.testElasticSearch.services;

import com.zhangdianyang.testElasticSearch.dao.myuser;
import com.zhangdianyang.testElasticSearch.entity.MyUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class MyUserService implements MyUserServiceInt{

    @Resource
    private myuser myuser;

    @Override
    public List<MyUser> findmyuser(Map<String,Object> map){
        return myuser.findMyUser(map);
    }

}
