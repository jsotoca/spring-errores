package com.errores.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
    
    @ExceptionHandler({ArithmeticException.class})
    public String ArimeticaError(Exception ex, Model model){
        model.addAttribute("mensaje", "Error de arimetica");
        model.addAttribute("error", ex.getMessage());
        model.addAttribute("status", 500 );
        return "error/arimetica";
    }

}
