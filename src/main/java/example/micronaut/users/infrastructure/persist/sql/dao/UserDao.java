package example.micronaut.users.infrastructure.persist.sql.dao;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
public class UserDao {
    @Id
    @Column(name = "id", length = 36, unique = true, nullable = false)
    private String userId;

    @Column(name = "name", length = 100)
    private String userName;

    public UserDao(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
