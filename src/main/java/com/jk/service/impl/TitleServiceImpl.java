package com.jk.service.impl;

import com.jk.bean.Title;
import com.jk.mapper.TitleMapper;
import com.jk.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleMapper titleMapper;

    @Override
    public List<Title> queryTitle() {
        return titleMapper.queryTitle();
    }
}
