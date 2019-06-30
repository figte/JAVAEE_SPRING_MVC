/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.controladores;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("/sumar/{n1}/{n2}")
    public ModelAndView sumar(@PathVariable(value = "n1",required = false) double n1, @PathVariable(value = "n2",required = false) double n2) {
        ModelAndView mv = new ModelAndView("vista02");
        mv.addObject("resultado", (n1+n2));
        
        return mv;
    }

    @RequestMapping(value = "/prueba2", method = RequestMethod.GET)
    public ModelAndView prueba2(HttpServletRequest request) {

        return new ModelAndView("vista02").addObject("resultado", request.getParameter("v"));
    }
}
