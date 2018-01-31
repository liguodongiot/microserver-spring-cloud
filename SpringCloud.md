[TOC]

# Spring Cloud



https://start.spring.io/



## Eureka



```shell
spring-cloud-eureka-server
spring-cloud-eureka-client
```







## Zuul



### Zuul简介

Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能。

zuul有以下功能：

- Authentication
- Insights
- Stress Testing
- Canary Testing
- Dynamic Routing
- Service Migration
- Load Shedding
- Security
- Static Response handling
- Active/Active traffic management







## Spring Cloud Config

在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。

### 简介

分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。在spring cloud config 
组件中，分两个角色，一是config server，二是config client。



## Spring Cloud Bus



### 简介

Spring Cloud Bus 将分布式的节点用轻量的消息代理连接起来。它可以用于广播配置文件的更改或者服务之间的通讯，也可以用于监控。



## Spring Cloud Sleuth

### 简介

Spring Cloud Sleuth 主要功能就是在分布式系统中提供追踪解决方案，并且兼容支持了 zipkin，你只需要在pom文件中引入相应的依赖即可。Spring Cloud Sleuth集成了zipkin（服务追踪）组件。



### 服务追踪分析

微服务架构上通过业务来划分服务的，通过REST调用，对外暴露的一个接口，可能需要很多个服务协同才能完成这个接口功能，如果链路上任何一个服务出现问题或者网络超时，都会形成导致接口调用失败。随着业务的不断扩张，服务之间互相调用会越来越复杂。对调用链的分析会越来越复杂。





## Hystrix Dashboard

### 简介

在微服务架构中为例保证程序的可用性，防止程序出错导致网络阻塞，出现了断路器模型。断路器的状况反应了一个程序的可用性和健壮性，它是一个重要指标。

Hystrix Dashboard是作为断路器状态的一个组件，提供了数据监控和友好的图形化界面。





```
spring-cloud-eureka-server
spring-cloud-eureka-client-dashboard
```

## 断路器聚合监控(Hystrix Turbine)

利用Hystrix Dashboard去监控断路器的Hystrix command。当我们有很多个服务的时候，这就需要聚合所以服务的Hystrix Dashboard的数据了。这就需要用到Spring Cloud的另一个组件了，即Hystrix Turbine。

```shell
spring-cloud-eureka-server
spring-cloud-eureka-client-dashboard
spring-cloud-eureka-client-lucy
spring-cloud-eureka-service-turbine
```











## consul

```shell
consul 具有以下性质：

服务发现：consul通过http 方式注册服务，并且服务与服务之间相互感应。
服务健康监测
key/value 存储
多数据中心

```





## docker简介

Docker是一个开源的引擎，可以轻松的为任何应用创建一个轻量级的、可移植的、自给自足的容器。开发者在笔记本上编译测试通过的容器可以批量地在生产环境中部署，包括VMs（虚拟机）、bare metal、OpenStack 集群和其他的基础应用平台。 
**Docker通常用于如下场景**

- web应用的自动化打包和发布；
- 自动化测试和持续集成、发布；
- 在服务型环境中部署和调整数据库或其他的后台应用；
- 从头编译或者扩展现有的OpenShift或Cloud Foundry平台来搭建自己的PaaS环境。

**Docker 的优点**

1、简化程序： 
Docker 让开发者可以打包他们的应用以及依赖包到一个可移植的容器中，然后发布到任何流行的 Linux 机器上，便可以实现虚拟化。Docker改变了虚拟化的方式，使开发者可以直接将自己的成果放入Docker中进行管理。方便快捷已经是 Docker的最大优势，过去需要用数天乃至数周的 任务，在Docker容器的处理下，只需要数秒就能完成。

2、避免选择恐惧症： 
如果你有选择恐惧症，还是资深患者。Docker 帮你 打包你的纠结！比如 Docker 镜像；Docker 镜像中包含了运行环境和配置，所以 Docker 可以简化部署多种应用实例工作。比如 Web 应用、后台应用、数据库应用、大数据应用比如 Hadoop 集群、消息队列等等都可以打包成一个镜像部署。

3、节省开支： 
一方面，云计算时代到来，使开发者不必为了追求效果而配置高额的硬件，Docker 改变了高性能必然高价格的思维定势。Docker 与云的结合，让云空间得到更充分的利用。不仅解决了硬件管理的问题，也改变了虚拟化的方式。



```shell
[root@runoob ~]# uname -r

[root@runoob ~]# yum -y install docker

[root@runoob ~]# service docker start

[root@runoob ~]# docker run hello-world




[root@runoob ~]# docker images  
REPOSITORY                                 TAG                 IMAGE ID            CREATED             SIZE
forezp/spring-cloud-eureka-server-docker   latest              aa0c425b3300        44 minutes ago      207MB
forezp/spring-cloud-eureka-client-docker   latest              a02de124759e        45 minutes ago      202MB
<none>                                     <none>              c124eb7ccaba        3 hours ago         167MB
frolvlad/alpine-oraclejdk8                 slim                ceae9ac75359        11 days ago         167MB
rabbitmq                                   3-management        6cb6e2f951a8        5 weeks ago         151MB
hello-world                                latest              f2a91732366c        2 months ago        1.85kB
hub.c.163.com/library/rabbitmq             latest              88b79c465d96        5 months ago        124MB
hub.c.163.com/library/mongo                latest              b39de1d79a53        5 months ago        359MB

[root@runoob ~]# docker ps 
CONTAINER ID        IMAGE                                      COMMAND                  CREATED             STATUS              PORTS                    NAMES
cc52f3b564e7        forezp/spring-cloud-eureka-client-docker   "java -Djava.securit…"   20 minutes ago      Up 20 minutes       0.0.0.0:8763->8763/tcp   loving_kepler
5d9cf47c0fc6        forezp/spring-cloud-eureka-server-docker   "java -Djava.securit…"   20 minutes ago      Up 20 minutes       0.0.0.0:8761->8761/tcp   pedantic_wing
[root@runoob ~]# docker stop cc52f3b564e7
cc52f3b564e7

```







```shell
spring-cloud-eureka-server-docker
spring-cloud-eureka-client-docker
```

