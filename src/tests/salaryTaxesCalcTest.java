package tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import tools.salaryTaxesCalc;
import static org.junit.jupiter.api.Assertions.*;


public class salaryTaxesCalcTest {

    salaryTaxesCalc calc;

    @Test
    void testSalaryOnHands() {
        calc.setWorkdays(7);
        calc.setMonthWorkdays(21);
        calc.setSalary(100000);

        double result = calc.salaryOnHands();
        assertEquals(20714.29, result);
    }

}
