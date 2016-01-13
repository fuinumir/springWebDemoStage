package it.objectway.stage.repository.exception;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
public class CatalogDaoException extends Exception {
    public CatalogDaoException() {
    }
    public CatalogDaoException( final String message ) {
        super( message );
    }
    public CatalogDaoException( final String message, final Throwable cause ) {
        super( message, cause );
    }
    public CatalogDaoException( final Throwable cause ) {
        super( cause );
    }
    public CatalogDaoException( final String message, final Throwable cause, final boolean enableSuppression, final boolean
            writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
