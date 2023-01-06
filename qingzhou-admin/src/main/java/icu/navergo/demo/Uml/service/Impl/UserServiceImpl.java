package icu.navergo.demo.Uml.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import icu.navergo.demo.Uml.entity.UserInfo;
import icu.navergo.demo.Uml.mapper.UserMapper;
import icu.navergo.demo.Uml.entity.User;
import icu.navergo.demo.Uml.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
//    private UserMapper userMapper;
    @Autowired
    UserMapper userMapper;

//    public String getName(String id){
//        System.out.println(userMapper.selectById(1));
//        userMapper.selectById(1);
//        return "111";
//    }


    public boolean setOpenID(String open_id){
        return true;
    }

    @Override
    public void setUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getOpenID() {
        User user =userMapper.selectById(1);
        System.out.println(user.getUserName());
        return user;
    }

    public User selectOpenID(String openid){
        QueryWrapper<User> queryopenid =new QueryWrapper<>();
        queryopenid.lambda()
                .select(User::getOpenid)
                .eq(User::getOpenid,openid);

        return new User();
    }

    @Override
    public void selal(){
        List<User> users = userMapper.all();
        System.out.println(users);
    }

    @Override
    public UserInfo recade(String code) {


        String url = "https://api.weixin.qq.com/sns/jscode2session";

        String session_key = null;
        String openid = null;

        try {

            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.post(url)
                    .field("js_code", code)
                    .field("appid", "wxa2ffbb3acc0d3124")
                    .field("secret", "9f62be65a14ac57a6dd7c677a27671a8")
                    .field("grant_type", "authorization_code")
                    .asString();
            String result = response.getBody();
//            System.out.println(result);
            JSONObject Json = new JSONObject(result);
            System.out.println(Json);
            openid = Json.getString("openid");
            session_key = Json.getString("session_key");


        } catch (Exception e) {
            e.printStackTrace();
        }

        User user = proveOpenid(openid);//验证用户身份，如果没有直接注册
        UserInfo userInfo =(UserInfo) user;
        userInfo.setSession(session_key);
        return userInfo;
    }

/*
* 验证用户身份
*
*
*
* **/
    public User proveOpenid(String openid){
        if(userMapper.findOpenID(openid)>0){

            log.info("存在openid");

        }else {
            log.info("不存在ID,正在注册");
            userMapper.createNewUser(openid);
            userMapper.firstname(openid);
            log.info("注册成功");
            proveOpenid(openid);
        }
        User user=userMapper.getUser(openid);
        log.info(user.toString());
        return user;
    }

    @Override
    public void updateUserName(String username,String openid){
        userMapper.updateUserName(username,openid);
    }

    @Override
    public void updateUserImage(String userimage,String openid){
        userMapper.updateUserImage(userimage,openid);
    }


    //    @Override
//    public User seleID(String SF) {
//        return null;
//    }
//
//    @Override
//    public void minTimes(String SF) {
//
//    }

//    public User seleID(String SF){
//        try {
//            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
//            queryWrapper.lambda()
//                    .select(User::getTimes,User::getVip)
//                    .eq(User::getSfnumber,SF);
//            User user=new User();
//            user.setTimes(userMapper.selectOne(queryWrapper).getTimes());
//
//            return userMapper.selectOne(queryWrapper);
//        } catch (Exception e){
//            User user=new User();
//            user.setVip(0);
//            user.setTimes(0);
//            return user;
//        }
//    }
//
//    public void minTimes(String SF){
////        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
////        queryWrapper.lambda().
//        System.out.println("**************************");
//
//
//        UpdateWrapper<User> updateWrapper=new UpdateWrapper<>();
//        int a=seleID(SF).getTimes();
//        System.out.println(a);
//        System.out.println("**************************");
////        updateWrapper.lambda().set(User::getTimes,a-1)
//                updateWrapper.lambda().setSql("times=times-1")
//                .eq(User::getSfnumber,SF);
//        User user=new User();
//        update(updateWrapper);
//
//    }


//    public void vipFY(){
//
//    }


}
