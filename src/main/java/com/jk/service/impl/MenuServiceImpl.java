package com.jk.service.impl;

import com.jk.bean.Week;
import com.jk.mapper.MenuMapper;
import com.jk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Week> getImgs(String flog) {

        return menuMapper.getImgs(flog);
    }
}
