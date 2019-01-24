package com.jk.bean;

public class Class_1 {

    private Integer id;// Id

    private String flmch1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlmch1() {
        return flmch1;
    }

    public void setFlmch1(String flmch1) {
        this.flmch1 = flmch1;
    }

    @Override
    public String toString() {
        return "Class_test{" +
                "id=" + id +
                ", flmch1='" + flmch1 + '\'' +
                '}';
    }

}
