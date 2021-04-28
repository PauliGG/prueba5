package cl.awakelab.Evaluacion_Modulo5.configuracion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
@ComponentScan("cl.awakelab.Evaluacion_Modulo5")
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        // authentication manager (see below)
		auth.inMemoryAuthentication()
        .withUser("cliente").password(passwordEncoder().encode("123456")).roles("CLI")
        .and()
        .withUser("profesional").password(passwordEncoder().encode("123456")).roles("PRO")
        .and()
        .withUser("administrativo").password(passwordEncoder().encode("123456")).roles("AD");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // http builder configurations for authorize requests and form login (see below)
    	http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/contacto/**").hasRole("CLI")
        .antMatchers("/capacitacion/**").hasRole("CLI")
        .antMatchers("/visita/**").hasRole("PRO")
        .antMatchers("/chequeo/**").hasRole("PRO")
        .antMatchers("/usuario/**").hasRole("AD") 
        .antMatchers("/cliente/**").hasRole("AD")   /// crear y editar perfiles
        .antMatchers("/profesional/**").hasRole("AD")   /// crear y editar perfiles
        .antMatchers("/administrativo/**").hasRole("AD")   /// crear y editar perfiles
        .antMatchers("/pago/**").hasRole("AD") 
        .antMatchers("/administrativo/**").hasRole("AD") 
        .antMatchers("/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .exceptionHandling().accessDeniedPage("/error403jsp")
        .and()
        .formLogin().loginPage("/login").permitAll()    
        .and()  
        .httpBasic()
        .and()
        .logout().permitAll()
        .deleteCookies("JSESSIONID")
        .logoutSuccessUrl("/login?logout");
    }
    
    @Bean 
    public PasswordEncoder passwordEncoder() { 
        return new BCryptPasswordEncoder(); 
    }
}
