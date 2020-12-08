package com.newland.balbaxmx.simpletemple;

import com.newland.balbaxmx.simpletemple.common.LogUtil;
import com.newland.balbaxmx.simpletemple.common.SpringBeanUtil;
import com.newland.balbaxmx.simpletemple.launch.LaunchStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleTempleApplication {

    public static void main(String[] args) {
        LogUtil.setLogFilePath();
        ApplicationContext context = SpringApplication.run(SimpleTempleApplication.class, args);
        SpringBeanUtil.setApplicationContext(context);
        LaunchStart start = SpringBeanUtil.getBean(LaunchStart.class);
        start.start(args);
    }

}
