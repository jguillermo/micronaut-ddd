package example.micronaut.users.application.users.create;

import example.micronaut.shared.application.CommandBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateCommand extends CommandBase {
    private String userId;
    private String userName;
}
