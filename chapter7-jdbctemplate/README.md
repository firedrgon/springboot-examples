## spring boot template 

 * 在pom.xml加入jdbcTemplate的依赖；
 * 编写DemoDao类，声明为：@Repository，引入JdbcTemplate
 * 编写DemoService类，引入DemoDao进行使用
 * 编写DemoController进行简单测试。
 
## 总结
 * 加入spring-boot-starter-jdbc
 * 注入@Autowired private JdbcTemplate jdbcTemplate;
 