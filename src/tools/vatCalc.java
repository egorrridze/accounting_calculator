package tools;


/** VAT calculator
 */
public class vatCalc {
    int id; // id: 1 - Allocated VAT/выделенный НДС, 2 - Added VAT/начисленный НДС
    double money, percents, tax;

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setPercents(double percents) {
        this.percents = percents;
    }

    public double getTax() {
        return tax;
    }

    public void tax(){
        double sum1, sumTax;
        if (id == 1){
            sum1 = (double) Math.round((money/(1+percents/100))*100)/100;
            sumTax = money;
            tax = (double) Math.round((sumTax - sum1)*100)/100;
            System.out.println("Сумма без НДС:\t" +  sum1 + "\nНДС " + percents + "%:\t\t" + tax
            + "\nВсего:\t\t\t" + sumTax);
        }
        else if (id == 2){
            sum1 = money;
            tax = (double) Math.round((money * (percents/100))*100)/100;
            sumTax = sum1 + tax;
            System.out.println("Сумма с НДС:\t" +  sum1 + "\nНДС " + percents + "%:\t\t" + tax
                    + "\nВсего:\t\t\t" + sumTax);
        }



    }
}
