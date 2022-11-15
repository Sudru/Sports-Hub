package io.github.sudru.SportsHub;

import io.github.sudru.SportsHub.model.User;
import io.github.sudru.SportsHub.repository.UserRepository;
import io.github.sudru.SportsHub.utils.SportsHubUtil;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SportsHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsHubApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	@Bean
	public SportsHubUtil sportsHubUtil(UserRepository userRepository){
		return new SportsHubUtil(userRepository);
	}
}
