package tests;

import org.junit.Test;
import tools.fineCalc;
import static org.junit.jupiter.api.Assertions.*;

public class fineCalcTest {

    fineCalc calc = new fineCalc();

    @Test
    public void testCompanyFine(){
        calc.setId(1);
        calc.setDaysOfDelay(18);
        calc.setDebtSum(50000);
        calc.fine();

        double result = calc.getFine();
        assertEquals(202.5, result);
    }
}
