package com.ll.sbmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 애너테이션은 HelloController 클래스가 컨트롤러의 기능을 수행한다는 의미이다. 이 애너테이션이 있어야 스프링부트 프레임워크가 컨트롤러로 인식한다.
public class HelloController {
    @GetMapping("/hello") // hello 메서드에 적용된 이 애너테이션은 URL 요청이 발생하면 hello 메서드가 실행됨을 의미한다.
    @ResponseBody // 이 애너테이션은 hello 메서드의 응답 결과가 문자열 그 자체임을 나타낸다. hello 메서드는 "Hello World"라는 문자열을 리턴하므로 출력으로 "Hello World" 문자열이 나갈 것이다.
    public String hello() {
        return "Hello World";
    }
}