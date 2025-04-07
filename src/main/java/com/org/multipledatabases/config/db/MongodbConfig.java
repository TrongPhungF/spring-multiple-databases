package com.org.multipledatabases.config.db;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.org.multipledatabases.mongodb.repository"
)
@ComponentScan(basePackages = "com.org.multipledatabases.mongodb")
public class MongodbConfig {
}
