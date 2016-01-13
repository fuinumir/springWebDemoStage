package it.objectway.stage.service;

import it.objectway.stage.model.Product;
import it.objectway.stage.service.exception.CatalogServiceException;

import java.util.List;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
public interface CatalogService {
    List<Product> retrieveProducts() throws CatalogServiceException;
}
