package com.ll.sbmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// URL : http://localhost:8080/

@SpringBootApplication // 이 애너테이션을 통해 스프링부트의 모든 설정이 관리된다.
public class SbMissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbMissionApplication.class, args);
    }

}
