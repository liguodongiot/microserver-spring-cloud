


```
http://localhost:9992/hi

foo version 2



消息队列

management.security.enabled=false
@RefreshScope
修改配置刷新 （post请求）
http://localhost:9992/bus/refresh

curl -d "" "http://172.22.2.180:9992/bus/refresh"
http://localhost:9992/bus/refresh


/bus/refresh接口可以指定服务，即使用”destination”参数，
比如 “/bus/refresh?destination=customers:**” 即刷新服务名为customers的所有服务，不管ip。




http://blog.csdn.net/hzw19920329/article/details/53156015

```