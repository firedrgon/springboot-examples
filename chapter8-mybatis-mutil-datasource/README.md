##Spring Boot使用Druid和监控配置
  * —— Druid简单介绍，具体看官网；
  * —— 在pom.xml配置druid依赖包；
  * —— 配置application.properties加入数据库源类型等参数；
  * —— 编写druid servlet和filter提供监控页面访问；
        http://localhost:8080/druid/index.html 
  * —— 输入地址进行测试； 
  
## 总结
  * druid过滤器配置@WebFilter
  * druid数据源状态监控StatViewServlet
  * 配置mybatis的SqlSessionFactory,DataSourceTransactionManager
  * 该项目集成了druid，配置mybatis多数据源和spring boot集成，配置的时候主要是注意mapper位置，和xml的位置,
    配置SqlSessionFactory,DataSourceTransactionManager
  * 在启动类加了@ServletComponentScan注解后

##在spring boot中添加自己的Servlet有两种方法，代码注册Servlet和注解自动注册（Filter和Listener也是如此）。
  * 代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。
  也可以通过实现 ServletContextInitializer 接口直接注册。
  * 在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。




