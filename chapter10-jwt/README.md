

## jwt(json web token)
- 用户发送按照约定，向服务端发送 Header、Payload 和 Signature，并包含认证信息（密码），验证通过后服务端返回一个token,之后用户使用该token作为登录凭证，适合于移动端和api


- 具体流程如下：
  1.登陆时生成token,并将token 保存到本地(提供两种方案：使用cookie 或者 localStorage)
  2.在需要权限控制的请求中都带着token
  3.验证token是否失效,如果失效,提示实现或者重定向到登陆页面,重新获取token.

 ![image](https://github.com/t-hong/springboot-examples/tree/master/chapter10-jwt/src/main/resources/static/images/oauth.JPG)


## 总结
 * jwt:Json web token,登录时返回token,之后用户使用该token作为登录凭证，使用移动端和api
 * 在过滤器，或拦截器验证token是否正确