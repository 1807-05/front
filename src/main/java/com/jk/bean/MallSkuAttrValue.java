package com.jk.bean;

import lombok.Data;

import java.util.Date;

//  t_mall_sku_attr_value(sku属性和属性值关联表)
@Data
public class MallSkuAttrValue {


   private  Integer id;                  // (编号)    

   private Integer shxm_id;             //(属性名id)  

   private Integer shxzh_id;            //(属性值id) 

   private Integer shp_id;              // (商品id)   

   private String is_sku;               // (是否sku)  

   private Date chjshj=new Date();                  // (创建时间)  

   private Integer sku_id;              // (skuid)  

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getShxm_id() {
      return shxm_id;
   }

   public void setShxm_id(Integer shxm_id) {
      this.shxm_id = shxm_id;
   }

   public Integer getShxzh_id() {
      return shxzh_id;
   }

   public void setShxzh_id(Integer shxzh_id) {
      this.shxzh_id = shxzh_id;
   }

   public Integer getShp_id() {
      return shp_id;
   }

   public void setShp_id(Integer shp_id) {
      this.shp_id = shp_id;
   }

   public String getIs_sku() {
      return is_sku;
   }

   public void setIs_sku(String is_sku) {
      this.is_sku = is_sku;
   }

   public Date getChjshj() {
      return chjshj;
   }

   public void setChjshj(Date chjshj) {
      this.chjshj = chjshj;
   }

   public Integer getSku_id() {
      return sku_id;
   }

   public void setSku_id(Integer sku_id) {
      this.sku_id = sku_id;
   }

   @Override
   public String toString() {
      return "MallSkuAttrValue{" +
              "id=" + id +
              ", shxm_id=" + shxm_id +
              ", shxzh_id=" + shxzh_id +
              ", shp_id=" + shp_id +
              ", is_sku='" + is_sku + '\'' +
              ", chjshj=" + chjshj +
              ", sku_id=" + sku_id +
              '}';
   }
}
