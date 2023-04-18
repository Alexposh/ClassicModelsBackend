package ro.alex.classicmodels.security.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ro.alex.classicmodels.dao.DaoUser;


@Service
public class MyUserDetailsService implements UserDetailsService {

	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 * 
	 * public com.ramadan.expensetracker.model.User registerNewUserAccount(UserDto
	 * accountDto) { // TODO: check if user already exists // if
	 * (emailExist(accountDto.getEmail())) { // throw new EmailExistsException( //
	 * "There is an account with that email adress:" + accountDto.getEmail()); // }
	 * com.ramadan.expensetracker.model.User user = new
	 * com.ramadan.expensetracker.model.User();
	 * user.setEmail(accountDto.getEmail());
	 * user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
	 * 
	 * // user.setRole(new Role(Integer.valueOf(1), user));
	 * com.ramadan.expensetracker.model.User result = daoUser.save(user); return
	 * result; }
	 */

	@Autowired
	private DaoUser daoUser;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return findLocalOrFacebookUser(username);
	}

	private UserDetails findLocalOrFacebookUser(String username) {
		Optional<ro.alex.classicmodels.model.User> optional = daoUser.findByEmail(username);

		if (optional.isPresent()) {
			ro.alex.classicmodels.model.User theUser = optional.get();

			UserDetails springSecurityUser = User.builder()
					// .username(theUser.getUsername())
					.username(theUser.getEmail()).password(theUser.getPassword())// passwordEncoder.encode(theUser.getPassword()))
					.authorities(getAuthority()).build();

			System.out.println("Building user with: " + theUser.getPassword());
			return springSecurityUser;
		}

		else {
			throw new UsernameNotFoundException("Invalid username or password.");
		}

	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Collections.emptyList();
	}
}