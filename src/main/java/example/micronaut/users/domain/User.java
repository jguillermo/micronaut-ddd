package example.micronaut.users.domain;

import lombok.Getter;

@Getter
public class User {

    private UserId userId;
    private UserName userName;

    public User(UserId userId, UserName userName) {
        super();
        this.userId = userId;
        this.userName = userName;
    }

    public static User create(UserId userId, UserName userName) {
        return new User(userId, userName);
    }


}
