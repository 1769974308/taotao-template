package com.taotao.swagger.ui.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.taotao.swagger.ui.mbg.mapper")
public class MyBatisConfig {
}
