package icu.navergo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContorller {


//    @RequestMapping(value = "test",method = RequestMethod.GET)
//    public String test(
//
////            @RequestParam("bodynumber") String id,
////            @RequestParam("SSID") String name,
////            @RequestParam("Password") String namep,
//            @RequestParam("file") MultipartFile filea
//    ){
//
//        System.out.println(filea.getOriginalFilename());
//        return filea.getOriginalFilename();
//    }
@RequestMapping(value = "test",method = RequestMethod.GET)
public String test(

//            @RequestParam("bodynumber") String id,
//            @RequestParam("SSID") String name,
//            @RequestParam("Password") String namep,
//            @RequestParam(value = "file") MultipartFile filea
){

//        System.out.println(filea.getOriginalFilename());
//        return "filea.getOriginalFilename()";
    return "yes";
}

    @RequestMapping(value = "teat",method = RequestMethod.GET)
    public String teat(

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
//        return result;r
        return "aa";
    }

}
