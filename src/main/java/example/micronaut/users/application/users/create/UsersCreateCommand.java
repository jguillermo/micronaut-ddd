package example.micronaut.users.application.users.create;

import example.micronaut.shared.application.ApplicationCommand;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;
import lombok.Getter;

@Getter
public class UsersCreateCommand extends ApplicationCommand {
    private UserId userId;
    private UserName userName;

    public UsersCreateCommand(String userId, String userName) {
        this.userId = new UserId(userId);
        this.userName = new UserName(userName);
    }
}
