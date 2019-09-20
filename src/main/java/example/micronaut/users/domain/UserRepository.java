package example.micronaut.users.domain;

public interface UserRepository {
	
	public User find(UserId userId);
	
    public void persist(User user);
    
}
