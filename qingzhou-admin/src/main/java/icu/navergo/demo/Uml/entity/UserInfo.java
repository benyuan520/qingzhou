package icu.navergo.demo.Uml.entity;

import io.swagger.annotations.ApiModelProperty;

public class UserInfo {

    private String session;

    @ApiModelProperty("用户姓名")
    protected String userName;

    @ApiModelProperty("性别 男 0 ,女 1")
    protected Integer userSex;

    @ApiModelProperty("用户年龄")
    protected Integer userAge;

    @ApiModelProperty("用户微信ID 类似于账号密码")
    protected String openid;

    protected String imageRole;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}

