##总结
* spring boot redis Cluster的配置使用
* spring.redis.cluster.nodes=
* JedisClusterConfig配置JedisCluster，和RedisTemplate
* JedisConnectionFactory,RedisClusterConfiguration,JedisCluster
* ConditionalOnClass(xxx.class)只有在类路径上存在该class才实例化bean，启用该配置
* @EnableConfigurationProperties()