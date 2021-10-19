package tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import tools.vatCalc;
import static org.junit.jupiter.api.Assertions.*;

class vatCalcTest {

    vatCalc calc = new vatCalc();;

    @Test
    void testAllocatedTaxes() {
        calc.setId(1);
        calc.setMoney(1000);
        calc.setPercents(18);

        double result = calc.tax();
        assertEquals(847.46, result);
    }

    @Test
    void testAddedTaxes() {
        calc.setId(2);
        calc.setMoney(1000);
        calc.setPercents(18);

        double result = calc.tax();
        assertEquals(1, result);
    }
}
