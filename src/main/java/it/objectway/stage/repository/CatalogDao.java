package it.objectway.stage.repository;

import it.objectway.stage.model.Product;
import it.objectway.stage.repository.exception.CatalogDaoException;

import java.util.List;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
public interface CatalogDao {
    List<Product> findProducts() throws CatalogDaoException;
}
