package com.jk.mapper;

import com.jk.bean.Week;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {
    @Select("select name from t_photo where weeks=#{weeks}")

    List<Week> getImgs(@Param("weeks") String flog);
}
