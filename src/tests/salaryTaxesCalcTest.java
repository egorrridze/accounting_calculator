package tests;

import org.junit.jupiter.api.Test;
import tools.salaryTaxesCalc;
import static org.junit.jupiter.api.Assertions.*;


public class salaryTaxesCalcTest {

    salaryTaxesCalc calc;

    @Test
    void testSalaryOnHands() {
        calc = new salaryTaxesCalc();
        calc.setWorkdays(5);
        calc.setMonthWorkdays(21);
        calc.setSalary(100000);
        calc.salaryOnHands();
        double result = calc.getSalaryOnHands();
        assertEquals(20714.28, result);
    }

}
