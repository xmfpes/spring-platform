package com.kyunam.springkyunam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	public void configure(WebSecurity web) throws Exception
	{
		web.ignoring().antMatchers("/css/**", "/js/**", "/");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		// 어드민 권한으로만 접근할 수 있는 경로.
		.antMatchers("/home/**").access("ROLE_ADMIN");
	}
}