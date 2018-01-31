


```
http://localhost:8761

http://localhost:8762/hi?name=forezp



mvn clean
mvn package docker:build


docker run -p 8761: 8761 -t forezp/eureka-server
docker run -p 8763: 8763 -t forezp/service-hi

```