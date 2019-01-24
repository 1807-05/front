package com.jk.bean;

public class Title {

    private Integer id;

    private String name;

    private String href;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}
