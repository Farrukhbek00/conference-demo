package com.jafton.conferencedemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

     /* This configuration class could be used to customize
     or create changes or configuration in our persistence
     add @Configuration annotation*/

//     @Bean
//     public DataSource dataSource() {
//         DataSourceBuilder builder = DataSourceBuilder.create();
//         builder.password("1234");
//         builder.username("postgres");
//         builder.url("jdbc:postgresql://localhost:5432/conference_app");
//         System.out.println("My custom datasource bean has been initialized and set");
//         return builder.build();
//     }
}
