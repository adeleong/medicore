package com.adeleon.medicore.web.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	protected final Log logger = LogFactory.getLog(getClass());
	
/*    @RequestMapping(value = "/{msg}", method = RequestMethod.GET)
    public String getIndex(Model model) {
    	
        model.addAttribute("msg", "Bienvenido");
        return "index";
    }
    */
    @RequestMapping(value="/index.html")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new Date()).toString();
        logger.info("Returning index view with " + now);

        return new ModelAndView("index", "msg", now);

    }
} 