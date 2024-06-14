package dev.aniket.JwtProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable();
       return http
               .csrf(customizer -> customizer.disable())
               .authorizeHttpRequests(request -> request
                       .requestMatchers("user/register", "user/login")
                       .permitAll()
                       .anyRequest()
                       .authenticated())
               .httpBasic(Customizer.withDefaults())
               .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
               .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
               .build();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder()
//                .username("rohan")
//                .password("r@123")
//                .roles("USER")
//                .build();
//
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder()
//                .username("rohit")
//                .password("4545")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User
//                .withDefaultPasswordEncoder() //not use any Encoder to convert the password. In the plan text stored it.
//                .username("Suresh")
//                .password("2020")
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user1, user2, admin);
//    }


    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    public AuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));

        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}

/*
*
* Disabling CSRF Protection:

http.csrf(customizer -> customizer.disable());
This line disables Cross-Site Request Forgery (CSRF) protection. CSRF is a type of attack that forces an end user to execute unwanted actions on a web application in which they're currently authenticated. Disabling CSRF protection might be suitable for stateless applications, such as those using token-based authentication.

Securing All Requests:

http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
This line configures the authorization for HTTP requests. It specifies that any request to the application must be authenticated. This means that all endpoints require the user to be logged in.

Enabling HTTP Basic Authentication:

http.httpBasic(Customizer.withDefaults());
This line enables HTTP Basic authentication, which is a simple authentication scheme built into the HTTP protocol. It transmits credentials as user ID and password pairs, encoded using Base64. The Customizer.withDefaults() method applies default settings for HTTP Basic authentication.

Configuring Session Management:

http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
This line configures the session management to be stateless. SessionCreationPolicy.STATELESS means that the application will not create or use HTTP sessions to store user authentication information. Each request must contain all necessary authentication information (typically through a token in the headers), suitable for RESTful APIs.

Building the Security Configuration:

return http.build();
This final line builds the SecurityFilterChain object based on the configured settings. This object is used by Spring Security to apply the security rules defined in the configuration.

*
* */