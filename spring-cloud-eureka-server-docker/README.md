



请求入口：<http://localhost:8761/>



```
[root@runoob ~]# uname -r

[root@runoob ~]# yum -y install docker

[root@runoob ~]# service docker start

[root@runoob ~]# docker run hello-world



cd *-client-docker
mvn clean package docker:build


cd *-server-docker
mvn clean package docker:build


docker run -p 8761:8761 -t forezp/spring-cloud-eureka-server-docker
docker run -p 8763:8763 -t forezp/spring-cloud-eureka-client-docker


http://10.250.140.14:8761/




史上最简单的SpringCloud教程 | 第十一篇: docker部署spring cloud项目
http://blog.csdn.net/forezp/article/details/70198649

docker安装使用
http://www.runoob.com/docker/centos-docker-install.html

用 Docker 构建、运行、发布一个 Spring Boot 应用
https://yq.aliyun.com/articles/47344
```
