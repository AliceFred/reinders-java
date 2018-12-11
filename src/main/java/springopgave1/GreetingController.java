package springopgave1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/greeting.html")
    public String greeting(
            @RequestParam(name="fullname") String name, Model model
    ) {
    model.addAttribute("fullname", name);
    return "greeting";
    }
}
