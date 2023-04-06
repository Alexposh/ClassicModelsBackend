package ro.alex.classicmodels.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncoderConfig {

	@Bean
	public PasswordEncoder customPasswordEncoder() {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				System.out.println("RAW PASSWORD: " + rawPassword);
				String saltRandom = "$2a$04$8.35yiv9sfFLPtaqzREEfu";// BCrypt.gensalt(4);
				System.out.println("SALT RANDOM: " + saltRandom);
				// return BCrypt.hashpw(rawPassword.toString(), saltRandom); //
				return rawPassword.toString();
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				System.out.println("MATCHES: " + rawPassword + " / " + encodedPassword);
				if(rawPassword.equals("my-secret")) {
					System.out.println("STEP 1");
					return true;
				}
//				if (rawPassword.equals("my-secret")) {
//					System.out.println("STEP 2");
//					return BCrypt.checkpw(rawPassword.toString(), encode(encodedPassword));
//				}
				System.out.println("STEP 3");
				// return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
				return rawPassword.toString().equals(encodedPassword.toString());

			}
		};
	}

	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return new PasswordEncoder()
	 * {
	 * 
	 * @Override public String encode(CharSequence rawPassword) { return
	 * rawPassword.toString(); }
	 * 
	 * @Override public boolean matches(CharSequence rawPassword, String
	 * encodedPassword) { return rawPassword.toString().equals(encodedPassword); }
	 * }; }
	 */
}