package example.micronaut.shared.application;

public interface CommandHandlerBase<T extends CommandBase> {
	
	public void execute(T command);
	
}
