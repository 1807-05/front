package com.jk.bean;

public class Tm_class {

    private Integer id;// Id

    private Integer pp_id;

    private Integer flbh1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPp_id() {
        return pp_id;
    }

    public void setPp_id(Integer pp_id) {
        this.pp_id = pp_id;
    }

    public Integer getFlbh1() {
        return flbh1;
    }

    public void setFlbh1(Integer flbh1) {
        this.flbh1 = flbh1;
    }

    @Override
    public String toString() {
        return "Tm_class{" +
                "id=" + id +
                ", pp_id=" + pp_id +
                ", flbh1=" + flbh1 +
                '}';
    }
}
