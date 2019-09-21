package example.micronaut.users.application.users.create;

import example.micronaut.shared.application.CommandHandlerBase;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;

public class UserCreateCommandHandler implements CommandHandlerBase<UserCreateCommand> {

    private UserCreate service;

    public UserCreateCommandHandler(UserCreate service) {
        this.service = service;
    }

    @Override
    public void execute(UserCreateCommand command) {
        var userId = new UserId(command.getUserId());
        var userName = new UserName(command.getUserName());

        this.service.create(userId, userName);

    }
}


