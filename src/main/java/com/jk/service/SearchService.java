package com.jk.service;

import com.jk.bean.Attr;

import com.jk.bean.MallSku;
import com.jk.bean.MallValue;
import com.jk.bean.Pai;

import java.util.List;

public interface SearchService {


  List<MallValue> queryMallAttrById(Integer id);

  List<Attr> getAttr(String id);

  List<MallSku> queryAll(String id);

  List<Pai> queryPai(String id);
}
