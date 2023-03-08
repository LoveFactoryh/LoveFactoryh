package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;




@RestController
public class CController {

        @GetMapping("/hello")
        public String Hello(Model model) {

            model.addAttribute("saludo", "hola mundo");
            return "hello";
        }
    }





