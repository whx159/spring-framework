package com.whx.config;
import com.whx.model.DistributeLock;
import com.whx.model.Lock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Lock lock(){
        return new DistributeLock();
    }
}
