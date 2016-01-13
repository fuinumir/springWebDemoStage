package it.objectway.stage.model;

/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
public class Product {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }
    public void setName( final String name ) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice( final Double price ) {
        this.price = price;
    }
    public Product name( final String name ) {
        this.name = name;
        return this;
    }
    public Product price( final Double price ) {
        this.price = price;
        return this;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder( "Product{" );
        sb.append( "name='" ).append( name ).append( '\'' );
        sb.append( ", price=" ).append( price );
        sb.append( '}' );
        return sb.toString();
    }
}
