package com.liaotuo.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 18070959
 * @create 2018-12-18 2:41 PM
 * @desc 主数据源jpa配置
 **/
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryPrimary",
        transactionManagerRef = "transactionManagerPrimary",
        basePackages = {"com.didispace.domain.p"}) //设置Repository所在位置)
public class PrimaryConfig {
    @Qualifier("primaryDataSource")
    private DataSource primaryDataSource;


}