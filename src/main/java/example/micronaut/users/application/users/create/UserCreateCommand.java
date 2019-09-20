package example.micronaut.users.application.users.create;

import example.micronaut.shared.application.CommandBase;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;
import lombok.Getter;

@Getter
public class UserCreateCommand extends CommandBase {
    private UserId userId;
    private UserName userName;

    public UserCreateCommand(String userId, String userName) {
        this.userId = new UserId(userId);
        this.userName = new UserName(userName);
    }
}
