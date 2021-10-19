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
        calc.tax();

        double result = calc.getTax();
        assertEquals(152.54, result);
    }

    @Test
    void testAddedTaxes() {
        calc.setId(2);
        calc.setMoney(1000);
        calc.setPercents(18);
        calc.tax();

        double result = calc.getTax();
        assertEquals(180, result);
    }
}
