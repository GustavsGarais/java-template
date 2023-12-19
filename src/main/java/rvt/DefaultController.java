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
    ModelAndView about(@RequestParam MashMap<String, String<queryStringallParams){
        ModelAndView modelAndView = new ModelAndView("about");

        String id = queryStringallParams.get("id");
        String tittle = queryStringallParams.get("tittle");
        String description = queryStringallParams.get("description");

        CsvManager manager = new CsvManager(CsvManager.hobbies_csv);
        manager.addHobbyToCSV(id, tittle, description);

        // turpinat veidot html formu

        return modelAndView;
    }
}

    

