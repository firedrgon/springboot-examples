# Springboot  项目结构解析

* src/main/java下的程序入口：Chapter1Application
* src/main/resources下的配置文件：application.properties
* src/test/下的测试入口：Chapter1ApplicationTests

# 总结
* springboot打包部署到tomcat
* 修改pom.xml,设置打包为war,打包的名称
* springboot启动类继承SpringBootServletInitializer 类，覆盖configure()，把启动类Chapter1Application 注册进去。