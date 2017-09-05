package com.github.pixelstuermer.password4me.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity( prePostEnabled = true )
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   @Autowired
   public void configureGlobalSecurity( AuthenticationManagerBuilder auth ) throws Exception {
      auth.inMemoryAuthentication().withUser( "admin" ).password( "p455w0rd" ).roles( "ADMIN" );
   }

   @Override
   protected void configure( final HttpSecurity http ) throws Exception {
      http.authorizeRequests()
         .anyRequest().permitAll()
         .and().httpBasic()
         .and().csrf().disable();
   }

}
