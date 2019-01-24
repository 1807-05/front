package com.jk.bean;

import lombok.Data;

import java.util.ArrayList;


@Data
public class CopyMallSku extends MallSku {

    //t_mall_sku(sku库存表)和 t_mall_sku_attr_value(sku属性和属性值关联表) 是一对多的关系
    //java对象中描述一对多的关系

    private ArrayList<MallSkuAttrValue> attrVal;


}
