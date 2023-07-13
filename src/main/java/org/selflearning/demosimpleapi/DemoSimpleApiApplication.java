package org.selflearning.demosimpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class DemoSimpleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSimpleApiApplication.class, args);
    }

    @GetMapping("/")
    public String greetMe(){
        String text = "Testing spring app with disabled JMX in properties file #spring.jmx.enabled=true";
            return text;

    }

}
