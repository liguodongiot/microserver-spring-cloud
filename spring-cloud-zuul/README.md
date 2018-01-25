



```

http://localhost:8769/api-a/hi?name=forezp

http://localhost:8769/api-b/hi?name=liguodong



http://localhost:8769/api-a/hi?name=forezp&token=22 


filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：

    pre：路由之前
    routing：路由之时
    post： 路由之后
    error：发送错误调用
    filterOrder：过滤的顺序
    shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
    run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。

```