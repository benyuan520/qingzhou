package icu.navergo.demo.Uml.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.navergo.demo.Uml.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//    @Select("select * from user")
@Mapper
public interface UserMapper extends BaseMapper<User> {


    List<User> all();
    //查询用户是否存在
    @Select("select count(*) from user where openid=#{openid}")
    int findOpenID(String openid);


    //注册新用户
    @Insert("insert into user(openid) values(#{openid})")
    void createNewUser(String openid);


    //为新用户跟新名称
    @Update("update user set user_name = concat('匿名用户','_',SUBSTRING(openid,-6))  where openid=#{openid}")
    void firstname(String openid);

    //查询用户信息
    @Select("select * from user where openid=#{openid}")
    User getUser(String openid);


    //更新用户信息 姓名+头像
    @Update("update user set user_name = #{user_name} where openid=#{openid}")
    void updateUserName(String user_name,String openid);

    @Update("update user set image_role = #{image_role} where openid=#{openid}")
    void updateUserImage(String image_role,String openid);

}
