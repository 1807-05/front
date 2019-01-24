package com.jk.controller;

import com.jk.bean.*;
import com.jk.service.SearchService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("attr")
public class SearchController {
  @Resource
  private SearchService searchService;

  @RequestMapping("toHome")
  public String toHome(){
    return "jiansuo";
  }


  //=====属性查询
  @ResponseBody
  @RequestMapping("getAttr")
  public List<Attr> getAttr(String id){
     List<Attr> list= searchService.getAttr(id);
     for(Attr attr: list){
		 ArrayList<String> as = new ArrayList<>();
		List<MallValue> list1 = searchService.queryMallAttrById(attr.getId());

		 for(MallValue mallValue: list1){
			as.add(mallValue.getShxzh());
		   as.add(mallValue.getShxzh_mch());

		 }
		 attr.setShuxingzhi(as);
	  }
    return list;
  }
  //=====五表联查
  @ResponseBody
  @RequestMapping("queryAll")
  public List<MallSku> queryAll(String id){

    return searchService.queryAll(id);
  }
  //====查询品牌
  @ResponseBody
  @RequestMapping("queryPai")
  public List<Pai> queryPai(String id){
    return searchService.queryPai(id);
  }
}
