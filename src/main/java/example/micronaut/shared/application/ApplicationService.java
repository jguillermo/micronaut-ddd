package example.micronaut.shared.application;

public abstract class ApplicationService {
    public abstract void execute(ApplicationCommand command);
}
