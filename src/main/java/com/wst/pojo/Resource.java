package com.wst.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@Configuration
@EnableConfigurationProperties(Resource.class)
@ConfigurationProperties(prefix = "com.wst.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getWebsite() {

        return website;
    }

    public void setWebsite(String website) {

        this.website = website;
    }

    public String getLanguage() {

        return language;
    }

    public void setLanguage(String language) {

        this.language = language;
    }
}
