package com.salesken.exception;

import java.time.LocalDateTime;

import org.springframework.beans.factory.support.BeanDefinitionValidationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(StudentException.class)
	public ModelAndView saleskenExceptionHandler(StudentException ee,WebRequest req){
		
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), req.getDescription(false));
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
		
	}
	
	
	
	@ExceptionHandler(BeanDefinitionValidationException.class)
	public ModelAndView saleskenExceptionHandler(BeanDefinitionValidationException ee,WebRequest req){
		
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), req.getDescription(false));
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ModelAndView saleskenExceptionHandler(IllegalArgumentException ee,WebRequest req){
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), req.getDescription(false));
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView saleskenExceptionHandler(NoHandlerFoundException ee,WebRequest req){
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), req.getDescription(false));
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ModelAndView saleskenExceptionHandler(MethodArgumentNotValidException ee){
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), "");
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
		
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView saleskenExceptionHandler(Exception ee,WebRequest req){
		ErrorDetails err=new ErrorDetails(LocalDateTime.now(), ee.getMessage(), req.getDescription(false));
		
		 ModelAndView modelAndView =  new ModelAndView("error");
		    modelAndView.addObject("error", err.toString());
		    return modelAndView;
	}
}
