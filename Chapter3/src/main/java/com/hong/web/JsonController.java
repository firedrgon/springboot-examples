package com.hong.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hong.domain.User;

import java.util.Date;

/**
 * @ClassName: JsonController
 * @Description: (Spring boot 返回json数据)
 * @author hong
 * @date 2017/4/20
 * @version v1.1
 */
@RestController
/**
 * 如果我们不使用默认的json 解析工具，怎么替换成比较习惯的json框架是fastjson呢？ 有两种方式：
 * 第一种方法就是：
 *（1）启动类继承extends WebMvcConfigurerAdapter
 *（2）覆盖方法configureMessageConverters
 *
 * 第二种方方法是：
 *（1）在App.java启动类中，注入Bean : HttpMessageConverters
 *
 */
public class JsonController {


    /**
     * Spring Boot也是引用了JSON解析包Jackson，那么自然我们就可以在Demo对象上使用Jackson提供的json属性的注解，
     * 对时间进行格式化，对一些字段进行忽略等等
     * 注： 查看pom 依赖时可以看到spring boot 默认添加了jackson 的包。
     * @return
     */
    @RequestMapping(value="/getUser")//,produces = "application/json; charset=utf-8"  在设置第三方json 解析框架fastjson 时，统一处理
    public User getUser(){
        User user =new User();
        user.setId(1L);
        user.setAge(11);
        user.setName("张三");
        user.setCreateTime(new Date());
        return user;
    }






}
