package example.micronaut.shared.domain.types;

import java.util.UUID;

import example.micronaut.shared.exception.BadRequestException;

public abstract class TypeUUID extends TypeString {

    public TypeUUID(String uuid) {
        super(uuid);
        isValidate();
    }

    private void isValidate() {
        if (isNull()) {
            return;
        }
        try {
            UUID.fromString(value());
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException("Uuid value no valid");
        }

    }
}
