package example.micronaut.shared.application;

public interface ApplicationQuery<C extends QueryBase, R extends Object> {
	
	public R execute(C command);
	
}
