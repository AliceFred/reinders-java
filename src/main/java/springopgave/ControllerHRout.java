package springopgave;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHRout {
    @RequestMapping("/hrout.html")
    public String hrout(
            @RequestParam(name="department") String name, Model model
    ) {
        Query1 q = new Query1();
        model.addAttribute("salaries", q.filledArrayList(name));
        //model.addAttribute("test", name);
        return "hrout";
    }

}

