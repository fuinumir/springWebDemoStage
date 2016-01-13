package it.objectway.stage.repository.impl;

import it.objectway.stage.model.Product;
import it.objectway.stage.repository.CatalogDao;
import it.objectway.stage.repository.exception.CatalogDaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */

@Repository
public class CatalogDaoImpl implements CatalogDao {

    private JdbcTemplate jdbcTemplate;

    public List<Product> findProducts() throws CatalogDaoException {
        List<Product> products = jdbcTemplate.query( "select * from product", new BeanPropertyRowMapper<Product>( Product.class ));
        return products;
    }

    @Autowired
    private void setDataSource( DataSource dataSource ) {
        jdbcTemplate = new JdbcTemplate( dataSource );
    }
}
