package com.jk.bean;

import lombok.Data;

@Data
public class Pai {
  private  Integer id;
  private  String  ppmch;
  private  String  url;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPpmch() {
    return ppmch;
  }

  public void setPpmch(String ppmch) {
    this.ppmch = ppmch;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Pai{" +
            "id=" + id +
            ", ppmch='" + ppmch + '\'' +
            ", url='" + url + '\'' +
            '}';
  }
}
