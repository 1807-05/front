package com.jk.bean;

import lombok.Data;

import java.util.Date;

@Data
public class MallSku {

    private Integer id;                 //(编号)    

    private Integer shp_id;           //(商品id)    

    private Integer kc;              //(库存)      

    private Double jg;              //(价格)      

    private Date chjshj;            //(创建时间) 

    private String sku_mch;         //(sku名称) 

    private Integer sku_xl;         //(sku销量)  

    private String kcdz;            //(库存地址)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShp_id() {
        return shp_id;
    }

    public void setShp_id(Integer shp_id) {
        this.shp_id = shp_id;
    }

    public Integer getKc() {
        return kc;
    }

    public void setKc(Integer kc) {
        this.kc = kc;
    }

    public Double getJg() {
        return jg;
    }

    public void setJg(Double jg) {
        this.jg = jg;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public String getSku_mch() {
        return sku_mch;
    }

    public void setSku_mch(String sku_mch) {
        this.sku_mch = sku_mch;
    }

    public Integer getSku_xl() {
        return sku_xl;
    }

    public void setSku_xl(Integer sku_xl) {
        this.sku_xl = sku_xl;
    }

    public String getKcdz() {
        return kcdz;
    }

    public void setKcdz(String kcdz) {
        this.kcdz = kcdz;
    }

    @Override
    public String toString() {
        return "MallSku{" +
                "id=" + id +
                ", shp_id=" + shp_id +
                ", kc=" + kc +
                ", jg=" + jg +
                ", chjshj=" + chjshj +
                ", sku_mch='" + sku_mch + '\'' +
                ", sku_xl=" + sku_xl +
                ", kcdz='" + kcdz + '\'' +
                '}';
    }
}
