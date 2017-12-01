### spring boot 中使用JSP
* application.xml配置spring.mvc.view前后缀
* pom.xml添加javax.servlet,tomcat嵌入等包，scope为provided(表示有容器提供tomcat)
* spring boot 启动类基础SpringBootServletInitializer覆盖configure方法