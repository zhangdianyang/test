package com.zhangdianyang.testElasticSearch.controller;


import com.alibaba.fastjson.JSONObject;
import com.zhangdianyang.testElasticSearch.config.EsConfig;
import com.zhangdianyang.testElasticSearch.entity.MyUser;
import com.zhangdianyang.testElasticSearch.services.MyUserServiceInt;
import org.elasticsearch.action.get.GetResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Resource
    private MyUserServiceInt myUserServiceInt;

    @Resource
    private EsConfig esConfig;

    @RequestMapping(value = "/es/save")
    public String test(long first,long end){
        Map<String,Object> map = new HashMap<>(2);
        map.put("first",first);
        map.put("end",end);
        List<MyUser> findmyuser = myUserServiceInt.findmyuser(map);
        return "success";
    }

    @RequestMapping(value = "/es/find")
    public String find(Long id) throws UnknownHostException {
        GetResponse myuser = esConfig.client().prepareGet("xxl-job", "myuser", id.toString()).get();
        return JSONObject.toJSONString(myuser.getSource());


    }



}
