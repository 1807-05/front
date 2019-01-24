package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
@Data
public class Attr {

    private Integer Id;        //编号

    private String shxm_mch;   //属性名称

    private String shfqy;      //是否启用

    private Integer flbh2;     //分类编号2

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chjshj;//(创建时间)    Date

    private List<String>  shuxingzhi;





    //-----------------临时字段
    private String shxz;//返回的属性值名称
    private Integer queryid;//用来条查

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getShxm_mch() {
        return shxm_mch;
    }

    public void setShxm_mch(String shxm_mch) {
        this.shxm_mch = shxm_mch;
    }

    public String getShfqy() {
        return shfqy;
    }

    public void setShfqy(String shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public List<String> getShuxingzhi() {
        return shuxingzhi;
    }

    public void setShuxingzhi(List<String> shuxingzhi) {
        this.shuxingzhi = shuxingzhi;
    }

    public String getShxz() {
        return shxz;
    }

    public void setShxz(String shxz) {
        this.shxz = shxz;
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }

    @Override
    public String toString() {
        return "Attr{" +
                "Id=" + Id +
                ", shxm_mch='" + shxm_mch + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", flbh2=" + flbh2 +
                ", chjshj=" + chjshj +
                ", shuxingzhi=" + shuxingzhi +
                ", shxz='" + shxz + '\'' +
                ", queryid=" + queryid +
                '}';
    }
}
