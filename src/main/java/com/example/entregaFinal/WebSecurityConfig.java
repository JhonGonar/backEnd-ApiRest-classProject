package com.example.entregaFinal;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/index.html").hasRole("USER")
                .antMatchers("/studentAlta.html").hasRole("ADMIN")
                .antMatchers("/studentsList.html").hasRole("ADMIN")
                .anyRequest()
                .permitAll()
                .and()
                .formLogin()
                .and()
                .logout();
    }
}
