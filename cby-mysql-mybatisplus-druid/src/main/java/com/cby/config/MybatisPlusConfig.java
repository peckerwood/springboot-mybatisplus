package com.cby.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * 
 * @author cby
 *
 *配置分页
 *https://baomidou.com/guide/page.html
 */
@Configuration
@MapperScan("com.cby.dao")
public class MybatisPlusConfig {
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		//配置分页
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		
		// 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
		
		
		
		return paginationInterceptor;
	}
}
