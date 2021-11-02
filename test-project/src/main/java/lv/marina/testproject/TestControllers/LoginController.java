package lv.marina.testproject.TestControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//because we return html
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model){
        return "login"; //will return the template from templates directory which is called login.html
    }

}
