package example.micronaut.shared.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import pe.lacafetalab.pao.shared.exceptions.BadRequestException;

@MappedSuperclass
public class TypeLong extends TypeBase<Long> {


	public TypeLong(Long value) {
		this.value = value;
	}

	public Long value() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeLong other = (TypeLong) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
