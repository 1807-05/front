package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class GoodsInfo {

    private Integer id; //编号
    private String shp_mch;//商品名称
    private String shp_tp;//商品图片
    private Integer flbh1;//分类编号1
    private Integer flbh2;//分类编号2
    private Integer pp_id;//品牌id

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date chjshj;//创建时间
    private String shp_msh;//商品描述

    private   String   zy;
    private   Integer  shp_id;
    private   String   url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShp_mch() {
        return shp_mch;
    }

    public void setShp_mch(String shp_mch) {
        this.shp_mch = shp_mch;
    }

    public String getShp_tp() {
        return shp_tp;
    }

    public void setShp_tp(String shp_tp) {
        this.shp_tp = shp_tp;
    }

    public Integer getFlbh1() {
        return flbh1;
    }

    public void setFlbh1(Integer flbh1) {
        this.flbh1 = flbh1;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }

    public Integer getPp_id() {
        return pp_id;
    }

    public void setPp_id(Integer pp_id) {
        this.pp_id = pp_id;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public String getShp_msh() {
        return shp_msh;
    }

    public void setShp_msh(String shp_msh) {
        this.shp_msh = shp_msh;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public Integer getShp_id() {
        return shp_id;
    }

    public void setShp_id(Integer shp_id) {
        this.shp_id = shp_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", shp_mch='" + shp_mch + '\'' +
                ", shp_tp='" + shp_tp + '\'' +
                ", flbh1=" + flbh1 +
                ", flbh2=" + flbh2 +
                ", pp_id=" + pp_id +
                ", chjshj=" + chjshj +
                ", shp_msh='" + shp_msh + '\'' +
                ", zy='" + zy + '\'' +
                ", shp_id=" + shp_id +
                ", url='" + url + '\'' +
                '}';
    }
}
