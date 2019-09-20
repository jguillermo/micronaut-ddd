package example.micronaut.shared.application;

public interface ApplicationCommand<T extends CommandBase> {
	
	public void execute(T command);
	
}
