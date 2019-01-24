package com.jk.bean;

import java.util.Date;

public class Value {

    private Integer Id;//(编号)  PKInteger
    private String shxzh;//(属性值) String(100)
    private String shfqy;//(是否启用)  String(1)
    private Integer shxm_id;//(属性id)  Integer
    private String shxzh_mch;//(单位) String(100)
    private Date chjshj;//(创建时间) Date

    //-----------------
    private String shxm;//(属性名) String(100)

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

    public String getShxm() {
        return shxm;
    }

    public void setShxm(String shxm) {
        this.shxm = shxm;
    }

    @Override
    public String toString() {
        return "Value{" +
                "Id=" + Id +
                ", shxzh='" + shxzh + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", shxm_id=" + shxm_id +
                ", shxzh_mch='" + shxzh_mch + '\'' +
                ", chjshj=" + chjshj +
                ", shxm='" + shxm + '\'' +
                '}';
    }
}
