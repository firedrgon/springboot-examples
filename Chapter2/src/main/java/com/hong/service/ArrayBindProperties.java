package com.hong.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hong on 2017/4/19.
 */
@Component
@ConfigurationProperties(prefix ="my")
public class ArrayBindProperties {

    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }

}
