package com.org.multipledatabases.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {

    @Bean
    public Flyway flywayPostgresql(@Qualifier("postgresqlDataSource") DataSource postgresqlDataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(postgresqlDataSource)
                .locations("classpath:db/migration/postgresql") // Specify location for PostgreSQL migrations
                .load();
        return flyway;
    }

    @Bean
    public Flyway flywayMysql(@Qualifier("mysqlDataSource") DataSource mysqlDataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(mysqlDataSource)
                .locations("classpath:db/migration/mysql") // Specify location for MySQL migrations
                .load();
        return flyway;
    }

//    @Bean
//    public Flyway flywayMongodb(@Qualifier("mongodbDataSource") DataSource mongodbDataSource) {
//        Flyway flyway = Flyway.configure()
//                .dataSource(mongodbDataSource)
//                .locations("classpath:db/migration/mongodb") // Specify location for mongodb migrations
//                .load();
//        return flyway;
//    }

}
