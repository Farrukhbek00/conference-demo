package com.jafton.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

     /* This configuration class could be used to customize
     or create changes or configuration in our persistence
     add @Configuration annotation*/

     @Bean
     public DataSource dataSource() {
         DataSourceBuilder builder = DataSourceBuilder.create();
         builder.password("1234");
         builder.username("postgres");
         builder.url("jdbc:postgresql://localhost:5432/conference_app");
         System.out.println("My custom datasource bean has been initialized and set");
         return builder.build();
     }
}
