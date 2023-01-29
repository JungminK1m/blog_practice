package shop.mtcoding.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.blog.model.UserRepository;
import shop.mtcoding.blog.util.Script;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @ResponseBody
    @PostMapping("/join")
    public String join(String username, String password, String email) {
        int result = userRepository.insert(username, password, email);
        if (result != 1) {
            return Script.back("회원가입에 실패했습니다");
        }
        return Script.href("/loginForm");
    }

    @GetMapping("/user/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }
}
