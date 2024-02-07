package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

@Controller
public class DefaultController {

    @GetMapping(value = "/test")
    @ResponseBody()
    public String testAction() {
        String name = "Jhon";
        String name1 = "Jhon1";
        String name2 = "Jhon2";

        return name + "<hr>" + name1 + "<hr>" + name2 + "<rh>";
    }

    /*
   @GetMapping(value = "/")
    ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView; 
    }

    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String, String> queryStringallParams){
        ModelAndView modelAndView = new ModelAndView("about");

        String id = queryStringallParams.get("id");
        String tittle = queryStringallParams.get("tittle");
        String description = queryStringallParams.get("description");

        // CsvManager manager = new CsvManager();
        // manager.addHobbyToCSV(id, tittle, description);

        // turpinat veidot html formu

        return modelAndView;

    }

    
    A a = new A();
    B b = new B();
    C c = new C();

    a.a();
    b.b();
    c.c();

    c.a();
    c.b();
    c.c();
    */

}

    

