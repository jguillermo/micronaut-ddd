package pe.lacafetalab.pao.shared.domain.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class UserId extends UUIDValueObject {
	private static final long serialVersionUID = 1L;

	protected UserId() {
	}

	public UserId(String uuid) {
		super(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
