package com.briup.apps.poll.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration//spring识别是配置类
@MapperScan("com.briup.apps.poll.dao")
public class MybatisConfig {

}
