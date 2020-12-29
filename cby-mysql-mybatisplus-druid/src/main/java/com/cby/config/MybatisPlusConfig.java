package com.cby.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cby.dao")
public class MybatisPlusConfig {

}
