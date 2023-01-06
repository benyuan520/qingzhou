package icu.navergo.demo.Jbml.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author :BenYuan
 * @create :2023/1/5 18:31
 * @Description TODO
 */
@Component
@Configuration
public class JedisConfig {
    @Bean
    public Jedis JedisCof(){
        System.out.println("*******************111111111");
        JedisPool pool = new JedisPool("120.48.104.164", 6379);
        Jedis jedis=pool.getResource();
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
//        System.out.println(dateFormat.format(date));

        jedis.set("upTime",dateFormat.format(date));
        return jedis;
    }


}
