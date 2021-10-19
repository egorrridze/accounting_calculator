import java.util.Scanner;

import tools.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        intro();
    }

    static void intro() {
        int id = 1;
        Scanner in = new Scanner(System.in);
        while (id != 0) {
            System.out.println("Выберите необходимый калькулятор:\n" +
                    "1 - Калькулятор зарплаты и взносов с зарплаты\n" +
                    "2 - Калькулятор НДС\n" +
                    "3 - Калькулятор пеней\n" +
                    "0 - выход из программы\nВаш выбор: ");
            id = in.nextInt();
            choice(id);
        }
    }

    static void choice(int id){
        int x;
        double y;
        salaryTaxesCalc salaryTaxesCalc = new salaryTaxesCalc();
        vatCalc vatCalc = new vatCalc();
        fineCalc fineCalc = new fineCalc();

        Scanner in = new Scanner(System.in);
        if (id == 1){
            System.out.println("Введите количество рабочих дней в месяце:  ");
            x = in.nextInt();
            salaryTaxesCalc.setWorkdays(x);
            System.out.println("Введите количество дней в месяце:  ");
            x = in.nextInt();
            salaryTaxesCalc.setMonthWorkdays(x);
            System.out.println("Введите оклад сотрудника:  ");
            y = in.nextDouble();
            salaryTaxesCalc.setSalary(y);
            salaryTaxesCalc.salaryOnHands();
            System.out.println("---------------------------------");
            //intro();
        }
        else if (id == 2){
            System.out.println("Выберите действие: 1 - выделить НДС, 2 - начислить НДС:");
            x = in.nextInt();
            vatCalc.setId(x);
            System.out.println("Введите цену:");
            y = in.nextDouble();
            vatCalc.setMoney(y);
            System.out.println("Введите процентную ставку (обычно 10/18/20):");
            y = in.nextDouble();
            vatCalc.setPercents(y);
            vatCalc.tax();
            System.out.println("---------------------------------");
            //intro();
        }
        else if (id == 3){
            System.out.println("Выберите тип должника: 1 - Юридическое лицо, 2 - ИП или физлицо:");
            x = in.nextInt();
            fineCalc.setId(x);
            System.out.println("Введите количество дней просрочки платежа:");
            x = in.nextInt();
            fineCalc.setDaysOfDelay(x);
            System.out.println("Введите сумму задолженности:");
            y = in.nextDouble();
            fineCalc.setDebtSum(y);
            fineCalc.fine();
            System.out.println("---------------------------------");
        }
    }
}
