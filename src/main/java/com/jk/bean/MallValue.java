package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/22 11:36
 */
@Data
public class MallValue {
    private Integer Id;
    private String shxzh;
    private String shfqy;
    private Integer shxm_id;
    private String shxzh_mch;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chjshj;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getShxzh() {
        return shxzh;
    }

    public void setShxzh(String shxzh) {
        this.shxzh = shxzh;
    }

    public String getShfqy() {
        return shfqy;
    }

    public void setShfqy(String shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getShxm_id() {
        return shxm_id;
    }

    public void setShxm_id(Integer shxm_id) {
        this.shxm_id = shxm_id;
    }

    public String getShxzh_mch() {
        return shxzh_mch;
    }

    public void setShxzh_mch(String shxzh_mch) {
        this.shxzh_mch = shxzh_mch;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    @Override
    public String toString() {
        return "MallValue{" +
                "Id=" + Id +
                ", shxzh='" + shxzh + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", shxm_id=" + shxm_id +
                ", shxzh_mch='" + shxzh_mch + '\'' +
                ", chjshj=" + chjshj +
                '}';
    }
}
