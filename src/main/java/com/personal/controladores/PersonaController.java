
package com.personal.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/persona")
public class PersonaController {
    
    @RequestMapping(value="index.htm", method = RequestMethod.GET)
    public ModelAndView prueba(){
        ModelAndView mv=new ModelAndView("prueba"); 
        return mv;
    }
}
