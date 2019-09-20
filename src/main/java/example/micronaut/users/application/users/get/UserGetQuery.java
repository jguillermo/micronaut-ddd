package example.micronaut.users.application.users.get;

import example.micronaut.shared.application.QueryBase;
import example.micronaut.users.domain.UserId;
import lombok.Getter;

@Getter
public class UserGetQuery extends QueryBase {
    private UserId userId;

    public UserGetQuery(String userId) {
    	super();
        this.userId = new UserId(userId);
    }
}
