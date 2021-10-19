package tests;

import org.junit.Before;
import org.junit.Test;
import tools.fineCalc;
import static org.junit.jupiter.api.Assertions.*;

public class fineCalcTest {

    fineCalc calc;

    @Test
    void testCompanyFine(){
        calc.setId(1);
        calc.setDaysOfDelay(30);
        calc.setDebtSum(50000);

        double result = calc.fine();
        assertEquals(332.92, result);
    }
}
