package icu.navergo.demo;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

public class main {

    public static void main(String[] args) {
//        SpringApplication.run(main.class,args);
        Jedis jedis=new Jedis("120.48.104.164",6379);
//        jedis.auth("sun12345");
        jedis.set("lll","6666");
        System.out.println("jeeee");
        
    }


}
