package hu.haku.gamestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.management.MXBean;

@SpringBootApplication
@EnableJpaRepositories
public class GamestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamestoreApplication.class, args);
	}

	@Bean
	PasswordEncoder createDefaultPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
