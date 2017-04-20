# 本章内容
###构建一个较为复杂的RESTful API以及单元测试 
###spring boot 返回json 数据 和 替换默认的json框架，使用第三方json 框架fastjson 
  
  
##提供两种配置方式：
   >第一种方法就是：
   * 启动类继承extends WebMvcConfigurerAdapter
   * 覆盖方法configureMessageConverters
   >第二种方方法是：
   * 在App.java启动类中，注入Bean : HttpMessageConverters
     