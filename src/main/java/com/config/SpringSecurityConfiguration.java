package com.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/***
 * @author Jeet Khatri
 * @since Jan 30,2019
 */

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/webjars/**")
				.permitAll().anyRequest().authenticated().and().logout().logoutSuccessUrl("/").permitAll();
	}
}
