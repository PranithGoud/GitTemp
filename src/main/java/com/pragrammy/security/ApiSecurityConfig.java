package com.pragrammy.security;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApiSecurityConfig {

	/*
	 * @Autowired UserDetailsService userDetailsService;
	 */
	/*
	 * @SuppressWarnings("deprecation") public AuthenticationProvider authProvider()
	 * { DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	 * provider.setUserDetailsService(userDetailsService);
	 * provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); return
	 * provider; }
	 */

	/*
	 * @Bean SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	 * 
	 * 
	 * XorCsrfTokenRequestAttributeHandler delegate = new
	 * XorCsrfTokenRequestAttributeHandler();
	 * delegate.setCsrfRequestAttributeName("_csrf"); CsrfTokenRequestHandler
	 * requestHandler = new CsrfTokenRequestHandler() {
	 * 
	 * @Override public void handle(HttpServletRequest request, HttpServletResponse
	 * response, Supplier<CsrfToken> csrfToken) { delegate.handle(request, response,
	 * csrfToken); } };
	 * 
	 * 
	 * return http.csrf(csrf -> csrf.ignoringRequestMatchers("/register/**",
	 * "/patient/**")) .authorizeHttpRequests((authorizeRequests) ->
	 * authorizeRequests.anyRequest().authenticated())
	 * .formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).
	 * build();
	 * 
	 * }
	 */
	/*
	 * @Bean WebSecurityCustomizer webSecurityCustomizer() { return (web) ->
	 * web.ignoring().requestMatchers("/register", "/patient/**"); }
	 */

	/*
	 * @Bean UserDetailsService userDetailsService() { UserDetails userDetails =
	 * User.builder() .username("user") .password("password") .roles("USER")
	 * .build();
	 * 
	 * return new InMemoryUserDetailsManager(userDetails); }
	 */
}
