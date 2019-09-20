package example.micronaut.users.infrastructure.persist.sql;

import java.util.Optional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserId;
import example.micronaut.users.domain.UserName;
import example.micronaut.users.domain.UserRepository;
import example.micronaut.users.infrastructure.persist.sql.dao.UserDao;
import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;

@Singleton
public class UserRepositorySql implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public UserRepositorySql(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void persist(User user) {
        UserDao userDao = new UserDao(user.getUserId().value(),user.getUserName().value());
        entityManager.persist(userDao);

    }

	@Override
	public Optional<User> findById(UserId userId) {
		UserDao userDao = entityManager.find(UserDao.class, userId.value());
		if (userDao != null) {
			return Optional.of(new User(new UserId(userDao.getUserId()), new UserName(userDao.getUserName())));
		} else {
			return Optional.empty();
		}
	}
}
