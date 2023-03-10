package com.example.LoveFactoryh.Controller;

import com.example.LoveFactoryh.Model.CConsultation;
import com.example.LoveFactoryh.interfaces.IConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping

public class CController {
@Autowired

    private IConsultation iConsultation;

//    public  List<CConsultation> list(){
//        return (List<CConsultation>) iConsultation.findAll();
//    }

@GetMapping("/")
    public String list (Model model){
       List<CConsultation> consultations = (List<CConsultation>)iConsultation.findAll();
       model.addAttribute("consultation", consultations);
       return "index";
    }
}





