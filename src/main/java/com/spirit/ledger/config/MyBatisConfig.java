package com.spirit.ledger.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.spirit.ledger.mbg.mapper")
public class MyBatisConfig {
}
