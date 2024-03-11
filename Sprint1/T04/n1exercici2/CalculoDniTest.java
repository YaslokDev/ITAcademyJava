package n1exercici2;

import org.junit.Test;

public class CalculoDniTest {

    @Test
    public void testCalculoDni() {
        CalculoDni calculoDni = new CalculoDni();

        char dni1 = CalculoDni.calculoDni(12345678);
        assert 'Z' == dni1;

        char dni2 = CalculoDni.calculoDni(14789874);
        assert 'T' == dni2;

        char dni3 = CalculoDni.calculoDni(23456789);
        assert 'D' == dni3;

        char dni4 = CalculoDni.calculoDni(98765432);
        assert 'M' == dni4;

        char dni5 = CalculoDni.calculoDni(11223344);
        assert 'B' == dni5;

        char dni6 = CalculoDni.calculoDni(25476547);
        assert 'E' == dni6;

        char dni7 = CalculoDni.calculoDni(87547854);
        assert 'X' == dni7;

        char dni8 = CalculoDni.calculoDni(14879654);
        assert 'B' == dni8;

        char dni9 = CalculoDni.calculoDni(37894532);
        assert 'P' == dni9;

        char dni10 = CalculoDni.calculoDni(47965478);
        assert 'J' == dni10;
    }
}
