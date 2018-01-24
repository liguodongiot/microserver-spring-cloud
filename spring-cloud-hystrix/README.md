


```
http://localhost:8764/hi?name=forezp

hi forezp,i am from port:8762
hi forezp,i am from port:8763




此时关闭 service-hi 工程，当我们再访问http://localhost:8764/hi?name=forezp，浏览器会显示：
hi ,forezp,orry,error!

这就说明当 service-hi 工程不可用的时候，
service-hystrix 调用 service-hi的API接口时，会执行快速失败，
直接返回一组字符串，而不是等待响应超时，这很好的控制了容器的线程阻塞。




http://localhost:8764/hystrix

http://localhost:8764/hystrix.stream

Delay: 2000 ms      Title: aaa

http://localhost:8764/hi?name=forezp
```