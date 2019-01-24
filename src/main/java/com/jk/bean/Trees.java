/** 
 * <pre>项目名称:week_employee_mm 
 * 文件名称:Trees.java 
 * 包名:com.jk.pojo 
 * 创建日期:2018-12-1下午6:52:04 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** 
 * <pre>项目名称：week_employee_mm    
 * 类名称：Trees    
 * 类描述：    
 * 创建人：孟梦
 * 创建时间：2018-12-1 下午6:52:04    
 * 修改人：孟梦
 * 修改时间：2018-12-1 下午6:52:04    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class Trees implements Serializable{
	private Integer id;  //主键

	private String text; //节点名

	private String url;  //跳转地址

	private Integer pid; //父id

	private String state; //状态

	private List<Trees> children;

	private boolean checked  ;// boolean 默认值是false

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}




}
