


```
http://localhost:8888/foo/dev

{
	"name": "foo",
	"profiles": ["dev"],
	"label": null,
	"version": null,
	"state": null,
	"propertySources": [{
		"name": "https://github.com/liguodongIOT/microserver-spring-cloud/spring-cloud-config-server/src/main/resources/application.properties",
		"source": {
			"spring.cloud.config.server.git.searchPaths": "spring-cloud-config-server/src/main/resources",
			"server.port": "8888",
			"spring.cloud.config.server.git.uri": "https://github.com/liguodongIOT/microserver-spring-cloud",
			"spring.cloud.config.server.git.username": "your username",
			"spring.cloud.config.server.git.password": "your password",
			"spring.cloud.config.label": "master",
			"spring.application.name": "config-client"
		}
	}]
}
```