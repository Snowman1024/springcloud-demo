package com.shen.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.shen.cloud.dao"})
public class MyBatisConfig {
}
