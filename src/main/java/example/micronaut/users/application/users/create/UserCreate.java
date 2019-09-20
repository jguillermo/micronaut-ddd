package example.micronaut.users.application.users.create;

import example.micronaut.shared.application.ApplicationCommand;
import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserRepository;

public class UserCreate implements ApplicationCommand<UserCreateCommand> {

	private UserRepository userRepository;

	public UserCreate(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void execute(UserCreateCommand command) {
		User user = User.create(command.getUserId(), command.getUserName());
		userRepository.persist(user);

	}
}
