package example.micronaut.usuario.domain;

import lombok.Getter;

@Getter
public class User {

	private UserId userId;
	private UserName name;
	
	public User(UserId userId, UserName name) {
		super();
		this.userId = userId;
		this.name = name;
	}
}
