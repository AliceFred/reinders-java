package springopgave;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHRupdate {
    @RequestMapping("/hrupdate.html")
    public String hrupdate(
            @RequestParam(name="last_name") String name,
            @RequestParam(name="id") int id, Model model
    ) {
        Query2 q = new Query2();
        model.addAttribute("updatecount", q.updatedEmployees(name, id));
        return "hrupdate";
    }

}

