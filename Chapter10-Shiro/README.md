
## Spring Boot 整合Shiro 基本步骤:

   *  pom.xml中添加Shiro依赖；
      >在Spring中注入类都是使用配置文件的方式，在Spring Boot中是使用注解的方式，那么应该如何进行实现呢？
       最简单的配置就是注入这两个类就ok了 
      * 第一就是ShiroFilterFactory
      * 第二就是SecurityManager
   
   *  注入Shiro Factory和SecurityManager。 
   
   *  身份认证
   
   *  权限控制