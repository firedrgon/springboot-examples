###总结
* @WebMvcConfigurerAdapter,web适配器,用于配置一些和web相关的属性.默认情况下，spring boot使用WebMvcConfigurerAdapter配置各种属性
* @WebServlet,配置Servlet,相当于在web.xml添加Servlet,Servlet基础HttpServlet
* @WebFilter,配置filter,实现Filter接口
* @WebListener实现ServletContextListener接口
* 拦截器,实现HandlerInterceptor(preHandle,postHandle,afterCompletion)接口，或继承HandlerInterceptorAdapter类
