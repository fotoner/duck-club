package moe.fotone.duckclub.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // CSRF 보호를 활성화합니다.
        http.csrf(csrf -> csrf.disable());

        // HTTP Request를-authorize
        http.authorizeHttpRequests(request -> request.requestMatchers("/**").permitAll());

        http.headers((headerConfig) -> headerConfig.frameOptions((config)->config.disable()));

        return http.build();
    }
}
