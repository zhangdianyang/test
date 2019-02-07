package com.zhangdianyang.testElasticSearch.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class EsConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        Settings settings = Settings.builder().put("cluster.name","elasticsearch").build();
        TransportClient client = new PreBuiltTransportClient(settings).addTransportAddress(
                new TransportAddress(InetAddress.getByName("127.0.0.1"),9300));
        return client;
    }
}
