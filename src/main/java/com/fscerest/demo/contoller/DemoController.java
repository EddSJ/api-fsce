/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fscerest.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fscerest.demo.bean.Noticias;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author Eddie
 */
@RestController
@RequestMapping("/")
public class DemoController {
    
    @RequestMapping(value="/noticias", method = RequestMethod.GET)
    public Noticias obtenerNoticias(HttpServletRequest req){
        Noticias not = new Noticias();
        not.setEncabezado("Este es el encabezado");
        not.setContenido("Este es el contenido");
        
        return not;
    }
}
