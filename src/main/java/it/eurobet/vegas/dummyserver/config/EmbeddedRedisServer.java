package it.eurobet.vegas.dummyserver.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Slf4j
@Component
public class EmbeddedRedisServer {

    private final RedisServer redisServer;

    public EmbeddedRedisServer(RedisProperties redisProperties) {
        this.redisServer = new RedisServer(redisProperties.getRedisPort());
    }

    @PostConstruct
    public void postConstruct() {
        log.info("STARTING Embedded Redis Server");
        redisServer.start();
        log.info("STARTED Embedded Redis Server");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("STOPPING Embedded Redis Server");
        redisServer.stop();
        log.info("STOPPED Embedded Redis Server");
    }

}
