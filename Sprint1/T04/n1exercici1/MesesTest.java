package n1exercici1;

import org.junit.Test;

public class MesesTest {

    @Test
    public void testMeses() {
        Meses meses = new Meses();

        assert meses.getMeses().size() == 12;

        assert meses.getMeses() != null;

        assert meses.getMeses().get(7).equals("Agosto");

    }
}
