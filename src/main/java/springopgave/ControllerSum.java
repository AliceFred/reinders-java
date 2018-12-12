package springopgave;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSum {
    @RequestMapping("sumout.html")
    public String sumout (
            @RequestParam("a") int a,
            @RequestParam("b") int b, Model model
    ) {
        model.addAttribute("sum", a+b);
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        return "sumout";
    }

}
