package example.micronaut.controller;

import example.micronaut.users.application.users.create.UserCreateCommand;
import example.micronaut.users.application.users.create.UserCreateCommandHandler;
import example.micronaut.users.application.users.find.UserFindQuery;
import example.micronaut.users.application.users.find.UserFindQueryHandler;
import example.micronaut.users.application.users.find.UserFindResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/users")
public class UsersController {

    final private UserCreateCommandHandler userCreateCommandHandler;
    final private UserFindQueryHandler userFindQueryHandler;

    public UsersController(UserCreateCommandHandler userCreateCommandHandler, UserFindQueryHandler userFindQueryHandler) {
        this.userCreateCommandHandler = userCreateCommandHandler;
        this.userFindQueryHandler = userFindQueryHandler;
    }

    @Post("/")
    public HttpResponse create(@Body UserCreateCommand command) {
        this.userCreateCommandHandler.execute(command);
        return HttpResponse.ok();
    }

    @Get(value = "/{userId}")
    public UserFindResponse find(String userId) {
        UserFindQuery query = new UserFindQuery(userId);
        return this.userFindQueryHandler.execute(query);
    }
}
