package com.adeleon.medicore.web.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class IndexControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{		
        IndexController controller = new IndexController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("index", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("msg");
        assertNotNull(nowValue);

    }

}