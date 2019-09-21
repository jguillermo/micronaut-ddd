package example.micronaut.users.application.users.find;

import example.micronaut.shared.application.AggregateResponseBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFindResponse implements AggregateResponseBase {
    private String id;
    private String name;

}
