package com.org.multipledatabases.config.db;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class FlywayConfig {

    private final @Qualifier("postgresqlDataSource") DataSource postgresqlDataSource;
    private final @Qualifier("mysqlDataSource") DataSource mysqlDataSource;
    private final @Qualifier("sqlserverDataSource") DataSource sqlserverDataSource;
    private final @Qualifier("oracleDataSource") DataSource oracleDataSource;

    @Value("${spring.flyway.postgresql.locations}")
    private String postgresqlLocations;

    @Value("${spring.flyway.mysql.locations}")
    private String mysqlLocations;

    @Value("${spring.flyway.sqlserver.locations}")
    private String sqlserverLocations;

    @Value("${spring.flyway.oracle.locations}")
    private String oracleLocations;

    @PostConstruct
    public void flyway() {

        Flyway postgresqlFlyway = Flyway.configure()
                .dataSource(postgresqlDataSource)
                .locations(postgresqlLocations).baselineOnMigrate(true)
                .load();

        Flyway mysqlFlyway = Flyway.configure()
                .dataSource(mysqlDataSource)
                .locations(mysqlLocations).baselineOnMigrate(true)
                .load();

        Flyway sqlserverFlyway = Flyway.configure()
                .dataSource(sqlserverDataSource)
                .locations(sqlserverLocations).baselineOnMigrate(true)
                .load();

        Flyway oracleFlyway = Flyway.configure()
                .dataSource(oracleDataSource)
                .locations(oracleLocations).baselineOnMigrate(true)
                .load();

        postgresqlFlyway.migrate();
        mysqlFlyway.migrate();
        sqlserverFlyway.migrate();
        oracleFlyway.migrate();
    }
}
