package kr.ac.skhu.A201632034;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/test2")
    public String test2(Model model){
        model.addAttribute("student", new Student());
        return "test2";
    }

    @PostMapping("/test2")
    public String test2(Model model, Student student){
            model.addAttribute("student", student);
            model.addAttribute("message", "저장되었습니다.");
            return "test2";
    }
}
