package example.micronaut.users.domain;

import java.util.Optional;

public interface UserRepository {
	
	public Optional<User> findById(UserId userId);
	
    public void persist(User user);
    
}
