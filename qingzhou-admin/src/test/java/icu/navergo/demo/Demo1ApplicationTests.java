//package com.example.demo;
//
//import com.example.demo.mapper.UserMapper;
//import com.example.demo.model.UserSF;
//import com.example.demo.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Demo1Application.class)
//class Demo1ApplicationTests {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void contextLoads() {
//        List<UserSF> Users =userMapper.selectList(null);
//        System.out.println(Users);
//
//    }
//    @Autowired
//    private UserService userService;
//    @Test
//    void Seccend(){
//        long count = userService.count();
//        System.out.println(count);
//
//    }
//
//}
