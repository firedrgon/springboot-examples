##Spring Boot Cache 基本理论;
  >Spring 3.1 引入了激动人心的基于注释（annotation）的缓存（cache）技术，它本质上不是一个具体的缓存实现方案（例如EHCache 或者 OSCache、Redis等），而是一个对缓存使用的抽象，通过在既有代码中添加少量它定义的各种 annotation，即能够达到缓存方法的返回对象的效果。
  >Spring 的缓存技术还具备相当的灵活性，不仅能够使用 SpEL（Spring Expression Language）来定义缓存的 key 和各种 condition，还提供开箱即用的缓存临时存储方案，也支持和主流的专业缓存例如 EHCache 集成。
  * 通过少量的配置 annotation 注释即可使得既有代码支持缓存
  * 支持开箱即用 Out-Of-The-Box，即不用安装和部署额外第三方组件即可使用缓存
  * 支持 Spring Express Language，能使用对象的任何属性或者方法来定义缓存的 key 和 condition
  * 支持 AspectJ，并通过其实现任何方法的缓存支持
  * 支持自定义 key 和自定义缓存管理者，具有相当的灵活性和扩展性
  
  
  
  \