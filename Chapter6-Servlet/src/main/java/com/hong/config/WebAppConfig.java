package com.hong.config;

import com.hong.interceptor.MyHandlerInterceptorAdapter;
import com.hong.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Web 适配器，用于注册一些与web相关的参数和元素.
 * Created by hong on 2017/5/25.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {



    /**
     * 配置一个拦截器.
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注意：当多个拦截器拦截路径一样时，按先后配置的顺序执行.
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new MyHandlerInterceptorAdapter()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
