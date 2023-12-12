package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/about")
    ModelAndView about() {
        CsvManager manager = new CsvManager("data/hobbies.csv");

        List hobbies = manager.getAllHobbies();
        
        ModelAndView modelAndView = new ModelAndView("about");
        modelAndView.addObject("hobbies", hobbies);

        return modelAndView;
    }
    /*
    String aboutMeAction(Model model) {
        String name = "";
        String surname = "";
        int age = 0;
        String group = "DP2-1";
        model.addAttribute("age");

        return "about";
    } */

    

    
}
