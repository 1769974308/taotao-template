package com.taotao.mybatis.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.taotao.mybatis.mbg.mapper")
public class MyBatisConfig {
}
