###总结
* 统一异常处理类：@ControllerAdvice
* 异常处理， 返回视图:ExceptionHandler(value = Exception.class)
* 异常处理，返回自定义的异常对象json:@ResponseBody @ExceptionHandler(value = Exception.class)
* @InitBinder页面表单和JavaBean的绑定
* @ModelAttribute注释的方法,会被每个@RequestMapping注释的目标方法执行前都会调用