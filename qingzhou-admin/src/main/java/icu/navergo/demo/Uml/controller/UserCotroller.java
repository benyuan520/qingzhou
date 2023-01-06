package icu.navergo.demo.Uml.controller;

/** 
*
*@Author :18165
*@create :2023/1/4 13:47
*@Description TODO
*
*/

import com.alibaba.fastjson.JSONObject;
import icu.navergo.api.CommonResult;
import icu.navergo.demo.Uml.service.UserService;
import icu.navergo.demo.Uml.entity.UserInfo;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCotroller {


    @Autowired
    UserService userService;
/**
*
*@Author :BenYuan
*@create :2023/1/4 13:51
*@Description TODO
*登入并获取用户信息
*/
    @ApiResponse(code = 200, message = "登入并获取用户信息")
    @RequestMapping(value = "getOpenid",method = RequestMethod.GET)
    public CommonResult<UserInfo> getOpenid(
            @RequestParam("code") String code
    ){
        UserInfo user=userService.recade(code);
        JSONObject.toJSONString(user);
        return CommonResult.success(user);
    }

//    @ApiResponse(code = 200, message = "登入并获取用户信息")
//    @RequestMapping(value = "getOpenid",method = RequestMethod.GET)
//    public CommonResult<Object> getOpenid(
//            @RequestParam("code") String code
//    ){
//        UserInfo user=userService.recade(code);
//        Object a =  JSONObject.toJSONString(user);
//        return CommonResult.success(a);
//    }
/**
*
*@Author :BenYuan
*@create :2023/1/4 14:05
*@Description TODO
*更新用户名
*/
    @ApiResponse(code = 200, message = "更新用户名")
    @RequestMapping(value = "UpdataUsername",method = RequestMethod.GET)
    public CommonResult UpdataUsername(
            @RequestParam("name") String name,
            @RequestParam("openid") String openid
    ){
        userService.updateUserName(name,openid);
        return CommonResult.success();
    }



    @ApiResponse(code = 200, message = "更新用户头像")
    @RequestMapping(value = "UpdataUserImage",method = RequestMethod.GET)
    public CommonResult UpdataUserImage(
            @RequestParam("load") String load,
            @RequestParam("openid") String openid
    ){
        userService.updateUserImage(load,openid);
        return CommonResult.success();
    }
}
