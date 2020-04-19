package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*To create image using cmd - below command
cmd - docker build -f Dockerfile -t docker-spring-boot .

docker images

To run image on docker engine using docker container
docker run -p 8085:8085 docker-spring-boot


Parallel free maven repo 
https://mymavenrepo.com/auth/login.html


Sonar :   localhost:9000
*
*/

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

	@GetMapping
	public String hello() {
		return "Hello YouTube";
	}
}
