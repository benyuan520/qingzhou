package icu.navergo.demo.Uml.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @RequestMapping(value = "/recode",method = RequestMethod.GET)
    public String recode(
            @RequestParam("code") String code
    ){
        System.out.println(code);


        return code;
    }
}
