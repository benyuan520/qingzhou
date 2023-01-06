package icu.navergo.demo.Jbml.controller;

//import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import icu.navergo.api.CommonResult;
import icu.navergo.demo.Jbml.Config.JedisConfig;
import icu.navergo.demo.Jbml.entity.Jb;
import icu.navergo.demo.Jbml.service.JbService;
import io.swagger.annotations.ApiResponse;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import scala.util.parsing.json.JSONArray;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@RestController
public class JbController {
    @Autowired
    JbService jbService;
    @Autowired
    Jedis jedis;
    @Value("${jedis.time}")
    String redisTime;
    @ApiResponse(code = 200, message = "获取")
    @RequestMapping(value = "selectJb",method = RequestMethod.GET)
//    public CommonResult<List<Jb>> selectJb(
////            @RequestParam("load") String load,
////            @RequestParam("openid") String openid
//    ){
//        jedis.set("j","666wodbaobi");
//        List<Jb> jbs = jbService.selectJbAll();
//        String a=new JSONObject().toJSONString(jbs);
//        System.out.println("*****"+a);
////        String s=new Gson().toJson(jbs);
////        System.out.println(s);
//        return CommonResult.success(jbs);
//    }


    public CommonResult<Object> selectJb(
//            @RequestParam("load") String load,
//            @RequestParam("openid") String openid
    ){
        int page=1;
        int pieces=2;
        String text="list_page="+page;
        if (jedis.get(text)==null){
            List<Jb> jbs = jbService.selectJbAll(page,pieces);
            String json=new JSONObject().toJSONString(jbs);
            jedis.setex(text, Long.parseLong(redisTime),json);
        }
        return CommonResult.success(jedis.get(text));
    }

}
