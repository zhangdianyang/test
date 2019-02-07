package com.zhangdianyang.testElasticSearch;

import com.zhangdianyang.testElasticSearch.config.EsConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(value = "com.zhangdianyang.testElasticSearch.dao")
public class TestElasticSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestElasticSearchApplication.class, args);
	}

}

