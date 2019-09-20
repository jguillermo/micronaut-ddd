package example.micronaut.users.infrastructure.persist.sql.dao;

import lombok.Getter;

import javax.persistence.*;

import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;

@Entity
@Table(name = "user")
@Getter
public class UserDao {
	@Id
	@Column(name = "id", length = 36, unique = true, nullable = false)
	private String userId;

	@Column(name = "name", length = 100)
	private String userName;

	public UserDao(User user) {
		this.userId = user.getUserId().value();
		this.userName = user.getUserName().value();
	}

	public User toDomain() {
		return new User(new UserId(getUserId()), new UserName(getUserName()));
	}
}
