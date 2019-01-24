package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Shu {

 private Integer id;
 private String  shxm_mch;
 private String  shfqy;
 private Integer flbh2;
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private  Date    chjshj;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
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

 @Override
 public String toString() {
  return "Shu{" +
          "id=" + id +
          ", shxm_mch='" + shxm_mch + '\'' +
          ", shfqy='" + shfqy + '\'' +
          ", flbh2=" + flbh2 +
          ", chjshj=" + chjshj +
          '}';
 }
}
