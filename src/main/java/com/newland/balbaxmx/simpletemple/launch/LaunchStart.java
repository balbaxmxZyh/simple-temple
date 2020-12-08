package com.newland.balbaxmx.simpletemple.launch;


import com.newland.balbaxmx.simpletemple.module.User;
import com.newland.balbaxmx.simpletemple.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zhangyh
 * @ClassName: LaunchStart
 * @Date: 2020/5/11 16:19
 * @Operation:
 * @Description: 主程序
 */
@Component
public class LaunchStart {

    private static Logger logger = LoggerFactory.getLogger(LaunchStart.class);

    @Autowired
    private UserService service;

    public void start(String[] args){
        logger.info("启动");
        List<User> list = service.selectAll();
        list.forEach(System.out::println);
        while (true){

        }
    }
}
