package com.jk.service.impl;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import com.jk.mapper.ShouLeftMapper;
import com.jk.service.ShouLeftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/23 15:46
 */
@Service
public class ShouLeftServiceImpl implements ShouLeftService {
    @Autowired
    private ShouLeftMapper shouLeftMapper;


    @Override
    public List<Class1> showLeft() {
        List<Class1> mallClass1 = shouLeftMapper.queryClass1();
        for (Class1 Class1 : mallClass1) {
            List<Class2> nameList = shouLeftMapper.Class1ByIdgetClass2Name(Class1.getId());
            String flag="";
            for (Class2 Class2 : nameList) {
                flag+="<a href='/view/toview?view=jiansuo&id1="+Class1.getId()+"&id2="+Class2.getId()+"'>"+Class2.getFlmch2()+"</a>  ";
            }

            Class1.setClass2(flag);
            System.out.println("class2======>"+flag);
        }
        return mallClass1;
    }
}
