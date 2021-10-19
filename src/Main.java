import java.util.Scanner;

import tools.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("������������!");
        intro();
    }

    static void intro() {
        int id = 1;
        Scanner in = new Scanner(System.in);
        while (id != 0) {
            System.out.println("�������� ����������� �����������:\n" +
                    "1 - ����������� �������� � ������� � ��������\n" +
                    "2 - ����������� ���\n" +
                    "3 - ����������� �����\n" +
                    "0 - ����� �� ���������\n��� �����: ");
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
            System.out.println("������� ���������� ������� ���� � ������:  ");
            x = in.nextInt();
            salaryTaxesCalc.setWorkdays(x);
            System.out.println("������� ���������� ���� � ������:  ");
            x = in.nextInt();
            salaryTaxesCalc.setMonthWorkdays(x);
            System.out.println("������� ����� ����������:  ");
            y = in.nextDouble();
            salaryTaxesCalc.setSalary(y);
            salaryTaxesCalc.salaryOnHands();
            System.out.println("---------------------------------");
            //intro();
        }
        else if (id == 2){
            System.out.println("�������� ��������: 1 - �������� ���, 2 - ��������� ���:");
            x = in.nextInt();
            vatCalc.setId(x);
            System.out.println("������� ����:");
            y = in.nextDouble();
            vatCalc.setMoney(y);
            System.out.println("������� ���������� ������ (������ 10/18/20):");
            y = in.nextDouble();
            vatCalc.setPercents(y);
            vatCalc.tax();
            System.out.println("---------------------------------");
            //intro();
        }
        else if (id == 3){
            System.out.println("�������� ��� ��������: 1 - ����������� ����, 2 - �� ��� �������:");
            x = in.nextInt();
            fineCalc.setId(x);
            System.out.println("������� ���������� ���� ��������� �������:");
            x = in.nextInt();
            fineCalc.setDaysOfDelay(x);
            System.out.println("������� ����� �������������:");
            y = in.nextDouble();
            fineCalc.setDebtSum(y);
            fineCalc.fine();
            System.out.println("---------------------------------");
        }
    }
}
