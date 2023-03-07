package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.time.LocalDateTime;


@RestController
public class CController {

        @GetMapping("/")
        public String dates(Model model) {

            model.addAttribute("tstamp", LocalDateTime.now());
            return "dates";
        }
    }





