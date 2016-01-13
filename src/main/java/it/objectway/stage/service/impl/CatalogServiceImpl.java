package it.objectway.stage.service.impl;

import it.objectway.stage.model.Product;
import it.objectway.stage.repository.CatalogDao;
import it.objectway.stage.repository.exception.CatalogDaoException;
import it.objectway.stage.service.CatalogService;
import it.objectway.stage.service.exception.CatalogServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogDao catalogDao;

    public List<Product> retrieveProducts() throws CatalogServiceException {

        final List<Product> result;
        try {
            result = catalogDao.findProducts();
        } catch ( CatalogDaoException e ) {
            throw new CatalogServiceException( e.getMessage(), e );
        }

        return result;
    }
}
