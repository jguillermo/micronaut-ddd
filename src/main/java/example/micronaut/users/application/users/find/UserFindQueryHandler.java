package example.micronaut.users.application.users.find;

import example.micronaut.shared.application.QueryHandlerBase;
import example.micronaut.users.domain.User;
import example.micronaut.users.domain.UserId;

import javax.inject.Singleton;

@Singleton
public class UserFindQueryHandler implements QueryHandlerBase<UserFindQuery, UserFindResponse> {

    private UserFind userFind;

    public UserFindQueryHandler(UserFind userFind) {
        this.userFind = userFind;
    }

    @Override
    public UserFindResponse execute(UserFindQuery query) {

        UserId userId = new UserId(query.getUserId());
        User user = this.userFind.find(userId);
        return new UserFindResponse(user.getUserId().value(), user.getUserName().value());
    }

}
