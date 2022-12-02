//package com.example.demo.controller;
//
//import com.example.demo.model.User;
//import com.example.demo.model.UserSF;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//
//@RestController
//public class AddController {
////    @RequestMapping(value = "/file/addFile",method = RequestMethod.POST)
////    public String addFile(@RequestParam MultipartFile file){
////        System.out.println("**************************");
////        System.out.println(file.getOriginalFilename());
//////        return  file;
//////        Secend secend= new Secend();
//////        secend.setName("123456");
////    return "11111111";
////    }
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "file/getfile",method = RequestMethod.GET)
//    public int getnumber(String a){
//        System.out.println(a);
////        userService.getName("1");
//
//        return userService.seleID(a).getTimes();
//    }
//
//    @RequestMapping(value = "/file/addFile",method = RequestMethod.POST)
//    public String addFile(@RequestParam MultipartFile file, UserSF user
//
////                          @RequestParam String IdentityCode,
////                          @RequestParam String APPID,
////                          @RequestParam String Password
//    ) throws Exception {
//        System.out.println("**************************");
////        System.out.println(IdentityCode+APPID+Password);
////        System.out.println(user.getPassword());
//        System.out.println(file.getOriginalFilename());
//        User userC =userService.seleID(user.getIdentityCode());
//        if(userC.getVip()==1){
//
//            if(userC.getTimes()>0){
//
//                    userService.minTimes(user.getIdentityCode());
//
//
//
//                    return "还有"+userC.getTimes()+"次";
//            }
//            return "您是vip";
//        }
//
////        TimeUnit.SECONDS.sleep(3);//秒
////        return  file;
////        Secend secend= new Secend();
////        secend.setName("123456");
//    return "123456789";
//    }
//}
