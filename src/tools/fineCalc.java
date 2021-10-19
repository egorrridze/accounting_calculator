package tools;


/** Fine calculator
 */
public class fineCalc {
    int id, daysOfDelay; // id: 1 - company, 2 - person
    double debtSum, fine;

    public void setId(int id) {
        this.id = id;
    }

    public void setDaysOfDelay(int daysOfDelay) {
        this.daysOfDelay = daysOfDelay;
    }

    public void setDebtSum(double debtSum) {
        this.debtSum = debtSum;
    }

    public double getFine() {
        return fine;
    }

    public void fine(){
        if (id == 1 || (id == 2 && daysOfDelay<=30)){
            fine = (double) Math.round((debtSum * daysOfDelay * 0.0675/300)*100)/100; // 6.75 - actual central bank rate
            System.out.println("Сумма пеней:\t" + fine);
        }
        else if (id == 2 && daysOfDelay>30){
            fine = (double) Math.round((debtSum * 30 * 6.75/300 + debtSum*(daysOfDelay-30)*0.0675/150)*100)/100;
            System.out.println("Сумма пеней:\t" + fine);
        }
    }
}
