package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CController {

    @GetMapping("/")
    public String controller(){

        return "Greetings from Spring Boot!";





        }

    }

