package com.jk.bean;

import lombok.Data;

@Data
public class Page {

  Integer page;

  Integer rows;

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  @Override
  public String toString() {
    return "Page{" +
            "page=" + page +
            ", rows=" + rows +
            '}';
  }
}
