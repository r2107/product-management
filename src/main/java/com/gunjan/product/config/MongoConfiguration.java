// package com.gunjan.product.config;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

	
// @Configuration
// @EnableMongoRepositories(basePackages = {"com.gunjan.product.Repository"})
// public class MongoConfiguration extends AbstractMongoClientConfiguration {

// 	    @Value("${spring.data.mongodb.database:productDb}")
// 	    private String databaseName;

// 	    /**
// 	     * Return the name of the database to connect to.
// 	     *
// 	     * @return must not be {@literal null}.
// 	     */
// 	    @Override
// 	    protected String getDatabaseName() {
// 	        return databaseName;
// 	    }
// }

