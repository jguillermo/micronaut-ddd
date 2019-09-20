package example.micronaut.controller;

import example.micronaut.users.application.users.create.UserCreate;
import example.micronaut.users.application.users.create.UserCreateCommand;
import example.micronaut.users.application.users.get.UserGet;
import example.micronaut.users.application.users.get.UserGetQuery;
import example.micronaut.users.domain.User;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/users")
public class UsersController {
	
	private final UserGet userGet;
	private final UserCreate userCreate;
	
	public UsersController(UserGet userGet, UserCreate userCreate) {
		this.userGet = userGet;
		this.userCreate = userCreate;
	}
	
	@Post("/")
    public HttpResponse<?> create(@Body UserCreateCommand command) {
        userCreate.execute(command);
        return HttpResponse.ok();
    }
	
	@Get(value = "/{userId}")
    public HttpResponse<User> list(String userId) {
        return HttpResponse.ok(userGet.execute(new UserGetQuery(userId)));
    }
}
