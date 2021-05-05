package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // data를 실어서 view로 보냄
        model.addAttribute("data", "hello!!!");
        // 화면 이름을 return
        return "hello";
    }
}
