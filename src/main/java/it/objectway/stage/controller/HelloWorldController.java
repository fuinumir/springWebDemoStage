package it.objectway.stage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
@Controller
@RequestMapping( "/hello" )
public class HelloWorldController {

    @RequestMapping( method = RequestMethod.GET )
    public ModelAndView hello() {
        final ModelAndView modelAndView = new ModelAndView();

        // Create the model



        modelAndView.addObject( "message", "Hello World from Spring MVC" );
        modelAndView.addObject( "date", new SimpleDateFormat( "dd/MM/yyyy" ).format( new Date() ) );

        // Choose the view
        modelAndView.setViewName( "hello" );

        return modelAndView;
    }
}
