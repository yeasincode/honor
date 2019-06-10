package com.honor.web;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile({"mq","hello-world"})
@Configuration
public class MqConfig {

    @Bean
    public Queue hello(){
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public MqReceiver receiver()
    {
       return new MqReceiver();
    }

    @Bean
    @Profile("sender")
    public MqSender sender(){
        return new MqSender();
    }
}
