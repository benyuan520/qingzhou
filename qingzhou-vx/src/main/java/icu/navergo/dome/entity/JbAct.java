package icu.navergo.dome.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@TableName("jb_act")
@ApiModel(value = "JbAct对象", description = "")
public class JbAct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "act_id", type = IdType.AUTO)
    private Integer actId;

    private Integer jbId;

    @ApiModelProperty("人物姓名 ")
    private String actName;

    private Integer actAge;

    private String actAbout;

    private String actImage;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getJbId() {
        return jbId;
    }

    public void setJbId(Integer jbId) {
        this.jbId = jbId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public Integer getActAge() {
        return actAge;
    }

    public void setActAge(Integer actAge) {
        this.actAge = actAge;
    }

    public String getActAbout() {
        return actAbout;
    }

    public void setActAbout(String actAbout) {
        this.actAbout = actAbout;
    }

    public String getActImage() {
        return actImage;
    }

    public void setActImage(String actImage) {
        this.actImage = actImage;
    }

    @Override
    public String toString() {
        return "JbAct{" +
            "actId = " + actId +
            ", jbId = " + jbId +
            ", actName = " + actName +
            ", actAge = " + actAge +
            ", actAbout = " + actAbout +
            ", actImage = " + actImage +
        "}";
    }
}
