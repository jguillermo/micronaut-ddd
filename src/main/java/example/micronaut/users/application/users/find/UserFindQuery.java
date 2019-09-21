package example.micronaut.users.application.users.find;

import example.micronaut.shared.application.QueryBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFindQuery extends QueryBase {
    private String userId;
}
