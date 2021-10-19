package tools;


/** Salary taxes calculator
 */
public class salaryTaxesCalc {
    int workdays, monthWorkdays;
    double salary, salaryOnHands;

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public void setMonthWorkdays(int monthWorkdays) {
        this.monthWorkdays = monthWorkdays;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryOnHands() {
        return salaryOnHands;
    }

    public void salaryOnHands(){
        double grossPay = (double) Math.round((salary/monthWorkdays*workdays)*100)/100;
        double personalIncomeTax =  (double) Math.round((grossPay * 0.13)*100)/100;
        salaryOnHands =  (double) Math.round((grossPay * 0.87)*100)/100;
        double pension =  (double) Math.round((grossPay*0.22)*100)/100,
                medical =  (double) Math.round((grossPay*0.051)*100)/100,
                social =  (double) Math.round((grossPay*0.029)*100)/100,
                insurance =  (double) Math.round((grossPay*0.002)*100)/100;
        System.out.println("Сумма зарплаты на руки:\t" + salaryOnHands + "\nСумма НДФЛ (13%):\t\t" + personalIncomeTax
        + "\n--------------------------\nОтчисления работодателя\nПенсионное (22%):\t\t" + pension
        + "\nМедицинское (5,1%):\t\t" + medical + "\nСоциальное (2,9%):\t\t" + social +
                "\nОтчисления в ФСС (0,2%): " + insurance);
    }

}
