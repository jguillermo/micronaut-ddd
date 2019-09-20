package example.micronaut.users.domain;

public interface UserRepository {
    public void persist(User user);
}
