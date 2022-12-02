//package com.example.demo.service.Impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.example.demo.mapper.UserMapper;
//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
////    private UserMapper userMapper;
//    @Autowired
//    UserMapper userMapper;
//    public String getName(String id){
//        System.out.println(userMapper.selectById(1));
//        userMapper.selectById(1);
//        return "111";
//    }
//
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
//
//
//    public void vipFY(){
//
//    }
//
//
//}
