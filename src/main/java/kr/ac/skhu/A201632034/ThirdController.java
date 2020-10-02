package kr.ac.skhu.A201632034;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {

    @RequestMapping("/test1")
    public String test1(Model model) {
        Student student = new Student(0, "201632034", "한영빈", "youngbin@office.skhu.ac.kr");
        model.addAttribute("student", student);
        return "test1";
    }
}
