package com.hong.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by hong on 2017/6/13.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * 自定义配置.
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 设置url访问权限,映射路径等等.
        http.authorizeRequests()
            .antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll()  // 虽都可以访问
            .antMatchers("/users/**").hasRole("USER")   // 需要相应的角色才能访问
            .antMatchers("/admins/**").hasRole("ADMIN")   // 需要相应的角色才能访问
            .and()
            .formLogin()   //基于 Form 表单登录验证
            .loginPage("/login").failureUrl("/login-error")  // 自定义登录界面
            .and()
            .logout()
            .logoutSuccessUrl("/login") //成功登出后，重定向到登录页.
            .and()
            .exceptionHandling().accessDeniedHandler(new AccessDeniedServletHandler());

    }

    /**
     * 用户信息服务.
     */
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(); // 在内存中存放用户信息
        manager.createUser(User.withUsername("hong").password("123456").roles("USER").build());
        manager.createUser(User.withUsername("admin").password("123456").roles("USER","ADMIN").build());
        return manager;
    }

    /**
     * 认证信息管理.
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }
}
