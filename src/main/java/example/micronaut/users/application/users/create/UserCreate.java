package example.micronaut.users.application.users.create;

import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;
import example.micronaut.users.domain.UserRepository;

import javax.inject.Singleton;

@Singleton
public class UserCreate {

    private UserRepository userRepository;

    public UserCreate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserId userId, UserName userName) {
        User user = User.create(userId, userName);
        userRepository.persist(user);
    }

}
