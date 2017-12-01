# 配置文件详解：自定义属性、随机数、多环境配置等
* 在application.properties文件中添加自定义属性(单个属性使用)；
* 在application.properties文件中添加自定义属性(多个属性使用)；
* 配置数组注入;
* 松散的绑定；
* 参数的引用；
* 随机数；
* 使用自定义的配置文件company.properties怎么操作；
* 在方法上使用@Bean的时候如何进行注入；
* 自定义结构；
* 校验；  （其实就是使用org.hibernate.validator 的注解。）


# 总结
* 多环境配置属性：spring.profile.active=dev
* 在配置环境里生成随机数:${random.value},${random.int},${random.long}
* 参数的引用使用:${com.title}
* 把配置映射为Bean:@Component,@ConfigurationProperty(prefix=""),@PropertySource(value="")
* 使用@Value,注入属性值,$Value(${"tt:test"}),不存在时默认为test
