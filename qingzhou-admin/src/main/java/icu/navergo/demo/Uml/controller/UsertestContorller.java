package icu.navergo.demo.Uml.controller;

//import icu.navergo.demo.model.User;
import icu.navergo.demo.Uml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsertestContorller {
    @Autowired
    UserService userService;
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
//@RequestMapping(value = "test",method = RequestMethod.GET)
//public CommonResult<User> test(
//
////            @RequestParam("bodynumber") String id,
////            @RequestParam("SSID") String name,
////            @RequestParam("Password") String namep,
////            @RequestParam(value = "file") MultipartFile filea
//){
//    userService.setOpenID("aaaa");
////        System.out.println(filea.getOriginalFilename());
////        return "filea.getOriginalFilename()";
//
//    return CommonResult.success(new User());
//}



//    @RequestMapping(value = "teet",method = RequestMethod.GET)
//    public CommonResult<User> teet(
//
////            @RequestParam("bodynumber") String id,
////            @RequestParam("SSID") String name,
////            @RequestParam("Password") String namep,
////            @RequestParam(value = "file") MultipartFile filea
//    ){
//        User user =userService.getOpenID();
////        System.out.println(filea.getOriginalFilename());
////        return "filea.getOriginalFilename()";
//
//        return CommonResult.success(user);
//    }
//
//    @RequestMapping(value = "setInfornation",method = RequestMethod.GET)
//    public CommonResult<User> setid(
//
//            @RequestParam("name") String name,
//            @RequestParam("open_id") String openId,
//            @RequestParam("image_page") String imagePage
////            @RequestParam(value = "file") MultipartFile filea
//    ){
//        User user=new User();
//        user.setName(name);
//        user.setOpenId(openId);
//        user.setImagePage(imagePage);
//        userService.setUser(user);
////        System.out.println(filea.getOriginalFilename());
////        return "filea.getOriginalFilename()";
//        return CommonResult.success(user);
//    }
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
//        return result;r;

return "bb";
}

}
