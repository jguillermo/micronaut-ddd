package example.micronaut.shared.domain;

import java.util.UUID;

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
            UUID.fromString(uuid);
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException("Uuid value no valid");
        }

    }
}
