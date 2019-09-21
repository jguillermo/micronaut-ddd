package example.micronaut.users.application.users.find;

import example.micronaut.shared.exception.NotFoundException;
import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserRepository;

import javax.inject.Singleton;

@Singleton
public class UserFind {

    private UserRepository userRepository;

    public UserFind(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User find(UserId userId) {
        return userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found"));
    }
}
