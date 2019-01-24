package com.jk.service.impl;

import com.jk.bean.Attr;

import com.jk.bean.MallSku;
import com.jk.bean.MallValue;
import com.jk.bean.Pai;
import com.jk.mapper.SearchMapper;
import com.jk.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SearchServiceImpl implements SearchService {
  @Resource
  private SearchMapper  searchMapper;

  @Override
  public List<MallValue> queryMallAttrById(Integer id) {
    return searchMapper.queryMallAttrById(id);
  }

  @Override
  public List<Attr> getAttr(String id) {

	 return searchMapper.getAttr(id);
  }

  @Override
  public List<MallSku> queryAll(String id) {

    return searchMapper.queryAll(id);
  }

  @Override
  public List<Pai> queryPai(String id) {

	 return searchMapper.queryPai(id);
  }
}
