package example.micronaut.users.application.users.create;


import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserRepository;

public class UsersCreate {

    private UserRepository userRepository;

    public UsersCreate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(UsersCreateCommand command) {
        User user = User.create(command.getUserId(), command.getUserName());
        this.userRepository.persist(user);
    }
}
