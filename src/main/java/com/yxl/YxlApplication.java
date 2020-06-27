package com.yxl;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class YxlApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxlApplication.class, args);
    }

}
