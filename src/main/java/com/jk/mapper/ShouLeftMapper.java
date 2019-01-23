package com.jk.mapper;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShouLeftMapper {

    List<Class1> queryClass1();

    List<Class2> Class1ByIdgetClass2Name(@Param("id") Integer id);
}
