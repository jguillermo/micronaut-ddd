package example.micronaut.shared.domain;


public abstract class TypeId extends TypeUUID {


    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException("El id no puede nulo");
        }
    }


}
