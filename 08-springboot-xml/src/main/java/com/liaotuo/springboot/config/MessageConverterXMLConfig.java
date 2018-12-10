package com.liaotuo.springboot.config;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author 18070959
 * @create 2018-12-08 5:16 PM
 * @desc Xml格式数据的消息转换配置
 **/

/*
 * 在传统Spring应用中，我们可以通过如下配置加入对Xml格式数据的消息转换实现
 * (WebMvcConfigurerAdapter在2.0已过时推荐使用WebMvcConfigurationSupport)
 * Springboot只需加入jackson-dataformat-xml依赖
 */
public class MessageConverterXMLConfig extends WebMvcConfigurationSupport {
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder builder = Jackson2ObjectMapperBuilder.xml();
        builder.indentOutput(true);
        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.build()));
    }
}