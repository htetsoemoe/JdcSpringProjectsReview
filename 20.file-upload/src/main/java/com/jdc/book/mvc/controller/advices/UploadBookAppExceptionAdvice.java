package com.jdc.book.mvc.controller.advices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.jdc.book.root.service.UploadBookAppException;

@ControllerAdvice
public class UploadBookAppExceptionAdvice {
	
	@ExceptionHandler
	ModelAndView handle(UploadBookAppException e) {
		var model = new ModelAndView("home");
		model.getModel().put("uploadMessage", "Ah! File upload is failing : %s".formatted(e.getMessage()));
		
		return model;
	}

}
