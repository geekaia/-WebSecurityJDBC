package br.edu.ifmt.websecurityjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityJdbcApplication {

    public static void main(String[] args) {
        System.out.println((new BCryptPasswordEncoder().encode("123456")));
        SpringApplication.run(WebSecurityJdbcApplication.class, args);
    }

}
