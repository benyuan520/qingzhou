package icu.navergo.demo.Uml.service;


import com.baomidou.mybatisplus.extension.service.IService;
import icu.navergo.demo.Uml.entity.User;
import icu.navergo.demo.Uml.entity.UserInfo;

public interface UserService extends IService<User> {



//    public String getName(String id);
//    public User seleID(String SF);
//    public void minTimes(String SF);


    public boolean setOpenID(String open_id);
    public void setUser(User user);
    public User getOpenID();

    void selal();



    UserInfo recade(String code);

    void updateUserName(String username, String openid);

    void updateUserImage(String username, String openid);
}
