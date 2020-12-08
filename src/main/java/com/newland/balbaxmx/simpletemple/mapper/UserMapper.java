package com.newland.balbaxmx.simpletemple.mapper;

import com.newland.balbaxmx.simpletemple.module.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


/**
 * @Author: zhangyh
 * @ClassName: StyUserDao
 * @Date: 2020/1/6 16:57
 * @Operation:
 * @Description: <![CDATA[ >= ]]>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUser();
}
