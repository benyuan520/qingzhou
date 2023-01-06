package icu.navergo.dome.controller;

import icu.navergo.dome.service.JbService;
import icu.navergo.api.CommonResult;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

//    @ApiResponse(code = 200, message = "更新用户头像")
//    @RequestMapping(value = "selectJb",method = RequestMethod.GET)
//    public CommonResult selectJb(
////            @RequestParam("load") String load,
////            @RequestParam("openid") String openid
//    ){
//        jbService.selectJbAll();
//        return CommonResult.success();
//    }
@RequestMapping(value = "teaat",method = RequestMethod.GET)
public String teaat(

//            @RequestParam("bodynumber") String id,
//            @RequestParam("SSID") String name,
//            @RequestParam("Password") String namep,
//            @RequestParam(value = "file") MultipartFile filea
){

//        System.out.println(filea.getOriginalFilename());
//        return "filea.getOriginalFilename()";
//        ResultCode result=new ResultCode();
//        result.setAA("12");
//        result.setBB(13);
//        return result;r;

    return "bb";
}
}
