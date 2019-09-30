package example.micronaut.shared.domain.types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectString extends TypeString {
    public ObjectString(String value) {
        super(value);
    }
}

public class TypeStringTests {


    @Test
    void stringOk() {
        ObjectString type = new ObjectString("Demo");
        assertEquals("Demo", type.value());
        assertEquals("Demo", type.toString());
        assertFalse(type.isNull());
        assertEquals(type, new ObjectString("Demo"));
        assertNotEquals(type, new ObjectString("Demo2"));

    }

    @Test
    void stringNull() {
        ObjectString type = new ObjectString(null);
        assertNull(type.value());
        assertNull(type.toString());
        assertTrue(type.isNull());
        assertEquals(type, new ObjectString(null));
        assertNotEquals(type, new ObjectString("Demo2"));
    }
}
