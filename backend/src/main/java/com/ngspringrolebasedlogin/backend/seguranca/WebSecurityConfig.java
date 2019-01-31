package com.ngspringrolebasedlogin.backend.seguranca;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      User.UserBuilder users = User.withDefaultPasswordEncoder();

      auth.inMemoryAuthentication()
            .withUser(users.username("john").password("123").roles("admin"))
            .withUser(users.username("beth").password("123").roles("cliente"));
   }
}
