package com.liaotuo.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 18070959
 * @create 2018-12-10 10:19 AM
 * @desc WebSecurity配置类
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "/home").permitAll().anyRequest().authenticated().and().formLogin()
                .loginPage("/login").permitAll().and().logout().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("password")).roles("USER");
    }

    /***
     * Spring security 5.0中新增了多种加密方式，也改变了密码的格式。会报错: There is no PasswordEncoder mapped for the id "null" 解决办法: Spring
     * Security的配置类WebSecurityConfig中新增下面代码
     *
     * @bean public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); } 并修改configureGlobal为下所示:
     * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { auth
     *            .inMemoryAuthentication()
     *            .withUser("user").password(passwordEncoder().encode("111111")).roles("USER"); }
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}