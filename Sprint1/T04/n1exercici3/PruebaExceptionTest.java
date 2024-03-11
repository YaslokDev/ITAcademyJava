package n1exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PruebaExceptionTest {
    @Test
    public void testThrowException() {

        assertThrows(ArrayIndexOutOfBoundsException.class, PruebaException::lanzarException);
    }
}