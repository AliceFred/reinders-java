package springopgave2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HRdbController {
    @RequestMapping("/hrout2.html")
    public String hrout2(
            @RequestParam(name="department") String name, Model model
    ) {
        Query q = new Query();
        model.addAttribute("salaries", q.filledArrayList(name));
        //model.addAttribute("test", name);
        return "hrout2";
    }

}

