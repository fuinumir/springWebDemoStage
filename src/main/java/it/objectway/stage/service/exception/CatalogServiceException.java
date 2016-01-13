package it.objectway.stage.service.exception;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
public class CatalogServiceException extends Exception {

    public CatalogServiceException() {
    }
    public CatalogServiceException( final String message ) {
        super( message );
    }
    public CatalogServiceException( final String message, final Throwable cause ) {
        super( message, cause );
    }
    public CatalogServiceException( final Throwable cause ) {
        super( cause );
    }
    public CatalogServiceException( final String message, final Throwable cause, final boolean enableSuppression, final boolean
            writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
