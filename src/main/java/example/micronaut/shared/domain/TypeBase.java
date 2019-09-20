package example.micronaut.shared.domain;

public abstract class TypeBase<T> {
	private T value;

	public TypeBase(T value) {
		this.value = value;
	}

	public T value() {
		return this.value;
	}

	public boolean isNull() {
		return this.value == null;
	}
}
