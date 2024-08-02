//package com.mycompany.webserverlenin;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests((requests) -> requests
//                .requestMatchers("/login", "/error", "/update-password", "/create-user").permitAll() // Allow access to login, error, update-password, and create-user endpoints
//                .anyRequest().authenticated() // Require authentication for all other requests
//            )
//            .formLogin((form) -> form
//                .loginPage("/login") // Custom login page
//                .defaultSuccessUrl("/home", true) // Redirect to /home after successful login
//                .failureUrl("/login?error=Invalid%20username%20or%20password") // Redirect to login with error query param on failure
//                .permitAll() // Allow everyone to access the login page
//            )
//            .logout((logout) -> logout
//                .permitAll() // Allow everyone to access the logout page
//            )
//            .csrf(csrf -> csrf
//                .ignoringRequestMatchers("/update-password", "/create-user") // Disable CSRF protection for update-password and create-user endpoints
//            );
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
//
//

package com.mycompany.webserverlenin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/login", "/error", "/update-password", "/create-user").permitAll()
                .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                .loginPage("/login")
                .defaultSuccessUrl("/home", true)
                .failureUrl("/login?error=Invalid%20username%20or%20password")
                .permitAll()
                )
                .logout((logout) -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .permitAll()
                )
                .csrf(csrf -> csrf
                .ignoringRequestMatchers("/update-password", "/create-user")
                )
                .sessionManagement(session -> session
                .sessionFixation().migrateSession()
                .invalidSessionUrl("/login?session=invalid")
                )
                .rememberMe()
                .key("uniqueAndSecret")
                .tokenValiditySeconds(86400); // 1 day

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

