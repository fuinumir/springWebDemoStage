package it.objectway.stage.controller;

import it.objectway.stage.service.CatalogService;
import it.objectway.stage.service.exception.CatalogServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Description:  CatalogController</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
@Controller
@RequestMapping( "/catalog" )
public class CatalogController {


    @Autowired
    private CatalogService catalogService;


    @RequestMapping( method = RequestMethod.GET )
    public ModelAndView products() {
        final ModelAndView modelAndView = new ModelAndView();

        try {
            modelAndView.addObject( "products", catalogService.retrieveProducts() );
            modelAndView.setViewName( "catalog" );
        } catch ( CatalogServiceException e ) {
            modelAndView.addObject( "errorMessage", e.getMessage() );
            modelAndView.setViewName( "error" );
        }
        return modelAndView;
    }
}
