package icu.navergo.demo.Jbml.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@ApiModel(value = "Jb对象", description = "")
public class Jb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "jb_id", type = IdType.AUTO)
    private Integer jbId;

    private String jbName;

    private Integer jbBoy;

    private Integer jbGirl;

    private Double jbTime;

    private Integer jbDiffcultId;

    private String jbMaker;

    private String jbImage;

    private Double jbScore;

    private String jbAbout;

    private LocalDateTime jbCreateTime;

    private Integer jbCreateUserId;

    private LocalDateTime jbUpdataTime;

    private Integer jbUpdataUserId;

    public Integer getJbId() {
        return jbId;
    }

    public void setJbId(Integer jbId) {
        this.jbId = jbId;
    }

    public String getJbName() {
        return jbName;
    }

    public void setJbName(String jbName) {
        this.jbName = jbName;
    }

    public Integer getJbBoy() {
        return jbBoy;
    }

    public void setJbBoy(Integer jbBoy) {
        this.jbBoy = jbBoy;
    }

    public Integer getJbGirl() {
        return jbGirl;
    }

    public void setJbGirl(Integer jbGirl) {
        this.jbGirl = jbGirl;
    }

    public Double getJbTime() {
        return jbTime;
    }

    public void setJbTime(Double jbTime) {
        this.jbTime = jbTime;
    }

    public Integer getJbDiffcultId() {
        return jbDiffcultId;
    }

    public void setJbDiffcultId(Integer jbDiffcultId) {
        this.jbDiffcultId = jbDiffcultId;
    }

    public String getJbMaker() {
        return jbMaker;
    }

    public void setJbMaker(String jbMaker) {
        this.jbMaker = jbMaker;
    }

    public String getJbImage() {
        return jbImage;
    }

    public void setJbImage(String jbImage) {
        this.jbImage = jbImage;
    }

    public Double getJbScore() {
        return jbScore;
    }

    public void setJbScore(Double jbScore) {
        this.jbScore = jbScore;
    }

    public String getJbAbout() {
        return jbAbout;
    }

    public void setJbAbout(String jbAbout) {
        this.jbAbout = jbAbout;
    }

    public LocalDateTime getJbCreateTime() {
        return jbCreateTime;
    }

    public void setJbCreateTime(LocalDateTime jbCreateTime) {
        this.jbCreateTime = jbCreateTime;
    }

    public Integer getJbCreateUserId() {
        return jbCreateUserId;
    }

    public void setJbCreateUserId(Integer jbCreateUserId) {
        this.jbCreateUserId = jbCreateUserId;
    }

    public LocalDateTime getJbUpdataTime() {
        return jbUpdataTime;
    }

    public void setJbUpdataTime(LocalDateTime jbUpdataTime) {
        this.jbUpdataTime = jbUpdataTime;
    }

    public Integer getJbUpdataUserId() {
        return jbUpdataUserId;
    }

    public void setJbUpdataUserId(Integer jbUpdataUserId) {
        this.jbUpdataUserId = jbUpdataUserId;
    }

    @Override
    public String toString() {
        return "Jb{" +
            "jbId = " + jbId +
            ", jbName = " + jbName +
            ", jbBoy = " + jbBoy +
            ", jbGirl = " + jbGirl +
            ", jbTime = " + jbTime +
            ", jbDiffcultId = " + jbDiffcultId +
            ", jbMaker = " + jbMaker +
            ", jbImage = " + jbImage +
            ", jbScore = " + jbScore +
            ", jbAbout = " + jbAbout +
            ", jbCreateTime = " + jbCreateTime +
            ", jbCreateUserId = " + jbCreateUserId +
            ", jbUpdataTime = " + jbUpdataTime +
            ", jbUpdataUserId = " + jbUpdataUserId +
        "}";
    }
}
