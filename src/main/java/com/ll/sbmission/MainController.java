package com.ll.sbmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // MainController 클래스는 스프링부트의 컨트롤러가 된다.
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody // 애너테이션은 URL 요청에 대한 응답으로 문자열을 리턴하라는 의미이다.
    public String 인사() {
        return "Hello World";
    }
}