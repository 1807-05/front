package com.jk.mapper;

import com.jk.bean.Attr;

import com.jk.bean.MallSku;
import com.jk.bean.MallValue;
import com.jk.bean.Pai;

import java.util.List;

public interface SearchMapper {

  List<MallValue> queryMallAttrById(Integer id);

  List<Attr> getAttr(String id);

  List<MallSku> queryAll(String id);

  List<Pai> queryPai(String id);
}
