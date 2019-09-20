package example.micronaut.users.application.users.get;

import example.micronaut.shared.application.ApplicationQuery;
import example.micronaut.shared.exception.NotFoundException;
import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserRepository;

public class UserGet implements ApplicationQuery<UserGetQuery, User> {

	private UserRepository userRepository;

	public UserGet(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User execute(UserGetQuery command) {
		return userRepository.findById(command.getUserId()).orElseThrow(() -> new NotFoundException("User not found"));
	}
}
