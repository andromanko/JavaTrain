package space.androma.ita.rest.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private AccessDeniedHandler accessDeniedHandler;
//    @Autowired
//    private DataSource dataSource;
//    
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/", "/signup/**", "/js/**", "/styles/**", "/images/**").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN").anyRequest().authenticated().and().formLogin().loginPage("/login")
//                .permitAll().and().logout().invalidateHttpSession(true).clearAuthentication(true)
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/").permitAll()
//                .and().exceptionHandling().accessDeniedHandler(accessDeniedHandler);
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
//        builder.jdbcAuthentication().dataSource(dataSource).authoritiesByUsernameQuery(
//                "SELECT user.login as login, role.role as role FROM user INNER JOIN user_role ON user.id = user_role.user_id INNER JOIN role ON user_role.role_id = role.id WHERE user.login = ?")
//                .usersByUsernameQuery("select login, password, 1 as enabled from user where login = ?");
//    }
//}
