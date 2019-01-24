package com.jk.bean;

import lombok.Data;

import java.util.List;

@Data
public class Gather {

    private Class_1 class_1;

    private Class_2  class_2;

    private Tm_class tm_class;

    private Trade_mark  trade_mark;

    private List<Gather> gather;

    public Class_1 getClass_1() {
        return class_1;
    }

    public void setClass_1(Class_1 class_1) {
        this.class_1 = class_1;
    }

    public Class_2 getClass_2() {
        return class_2;
    }

    public void setClass_2(Class_2 class_2) {
        this.class_2 = class_2;
    }

    public Tm_class getTm_class() {
        return tm_class;
    }

    public void setTm_class(Tm_class tm_class) {
        this.tm_class = tm_class;
    }

    public Trade_mark getTrade_mark() {
        return trade_mark;
    }

    public void setTrade_mark(Trade_mark trade_mark) {
        this.trade_mark = trade_mark;
    }

    public List<Gather> getGather() {
        return gather;
    }

    public void setGather(List<Gather> gather) {
        this.gather = gather;
    }

    @Override
    public String toString() {
        return "Gather{" +
                "class_1=" + class_1 +
                ", class_2=" + class_2 +
                ", tm_class=" + tm_class +
                ", trade_mark=" + trade_mark +
                ", gather=" + gather +
                '}';
    }
}
