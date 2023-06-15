package it.eurobet.vegas.american.config.redis;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class RedisProperties {
    private String redisHost;
    private int redisPort;

    public RedisProperties(
            @Value("${spring.redis.port}") int redisPort,
            @Value("${spring.redis.host}") String redisHost) {
        this.redisPort = redisPort;
        this.redisHost = redisHost;
    }

}
