


```
wget https://releases.hashicorp.com/consul/0.7.5/consul_0.7.5_linux_amd64.zip 
unzip consul_0.7.5_linux_amd64.zip

./consul 


./consul agent -server -ui -bootstrap-expect 1 -data-dir /tmp/consul 

# 可以查看server的信息
./consul members

# 查看节点
curl 127.0.0.1:8500/v1/catalog/nodes


以配置启动
mkdir -p  etc/consul.d

cd etc/consul.d/

对mysql的端口进行检测。注：mysql是tcp协议，支持脚本，http，tcp，ttl，python

vim mysql.json

{
    "services":[
        {
            "id":"mysql",
            "name":"mysql",
            "tags":["mysql"],
            "address":"127.0.0.1",
            "port":3306,
            "checks":[
                {
                    "Tcp":"127.0.0.1:3306",
                    "interval":"10s"
                }
            ]
        }
    ]
}

根据新的配置重启服务 
./consul agent -server -ui -bootstrap-expect 1 -data-dir /tmp/consul -config-dir etc/consul.d



http://blog.csdn.net/forezp/article/details/70188595










--------------------

consul agent -dev

打开网址：http://localhost:8500 ，可以看到界面，相关服务发现的界面。


http://localhost:8502/hi
```

