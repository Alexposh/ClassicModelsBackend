package ro.alex.classicmodels.security.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@Configuration
public class JDBCTokenConfig {
	
	@Value("${spring.datasource.url}")
	private String datasourceUrl;// = "jdbc:mysql://localhost:3308/springsecurityoauth2";

	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClassName; // = "com.mysql.cj.jdbc.Driver";

	@Value("${spring.datasource.username}")
	private String dbUsername;// ; = "root";

	@Value("${spring.datasource.password}")
	private String dbPassword;// = "root";

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(dbDriverClassName);
		dataSource.setUrl(datasourceUrl);
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);
		return dataSource;
	}

	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(dataSource());
	}
	
	
}
