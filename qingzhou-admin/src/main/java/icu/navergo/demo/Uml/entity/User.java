package icu.navergo.demo.Uml.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author benyuan
 * @since 2023-01-02
 */
@ApiModel(value = "User对象", description = "")
public class User extends UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

//    @ApiModelProperty("用户姓名")
//    protected String userName;
//
//    @ApiModelProperty("性别 男 0 ,女 1")
//    protected Integer userSex;
//
//    @ApiModelProperty("用户年龄")
//    protected Integer userAge;
//
//    @ApiModelProperty("用户微信ID 类似于账号密码")
//    protected String openid;
//
//    protected String imageRole;

//    private LocalDateTime tCreateTime;
//
//    private LocalDateTime tChangeTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getImageRole() {
        return imageRole;
    }

    public void setImageRole(String imageRole) {
        this.imageRole = imageRole;
    }


    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", userName = " + userName +
            ", userSex = " + userSex +
            ", userAge = " + userAge +
            ", openid = " + openid +
            ", imageRole = " + imageRole +
        "}";
    }
}
