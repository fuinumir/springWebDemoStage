package it.objectway.stage.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * <p>Description:  TODO Insert description here</p>
 * <p>Copyright:    Copyright (c) 2016</p>
 * <p>Company:      Ericsson</p>
 *
 * @author francesco
 */
@Configuration
public class SpringConfiguration {

    @Bean
    public DataSource dataSource(){
        final BasicDataSource datasource = new BasicDataSource();
        datasource.setDriverClassName( "com.mysql.jdbc.Driver" );
        datasource.setUsername( "catalog_user" );
        datasource.setPassword( "catalog" );
        datasource.setUrl( "jdbc:mysql://localhost:3306/catalogStage" );
        return datasource;
    }
}
