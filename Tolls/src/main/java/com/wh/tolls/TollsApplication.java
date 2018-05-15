package com.wh.tolls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages="com.wh.tolls")
@MapperScan(basePackages="com.wh.tolls.dao")
@EnableTransactionManagement			//事务管理
@EnableCaching							//缓存
public class TollsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollsApplication.class, args);
	}
	
}
