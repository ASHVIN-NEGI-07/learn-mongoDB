package com.ashvin.projects.learn_mongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoConfig {
        // this class is used to enable auditing in our application,
        // so that we can automatically set the createdAt and updatedAt fields in our Order class
}
