package view;

import model.Payroll;

import java.util.List;
import java.util.Scanner;

import static view.View.repositoryPayroll;

public class ViewPayroll {

    Payroll payroll;

    public ViewPayroll() {
        payroll =  new Payroll(1,20,100,0,9000,300,4,3,20);
    }

    public void meniu() {
        System.out.println("Apasa tasta 1 pentru a creea un payroll.");
        System.out.println("Apasa tasta 2 pentru sterge un payroll dupa id.");
        System.out.println("Apasa tasta 3 pentru a modifica over time pay.");
        System.out.println("Apasa tasta 4 pentru afisa toate payrollurile.");
    }

    public void play() {
        boolean run = true;
        int alege = 0;
        Scanner scanner = new Scanner(System.in);
        while (run == true) {
            meniu();
            alege = Integer.parseInt(scanner.nextLine());
            switch (alege) {
                case 1:
                    adaugarepayroll();
                    break;
                case 2:
                    stergerepayrollDupaId();
                    break;
                case 3:
                    modificareOvertimePay();
                    break;
                case 4:
                    afisarepayroll();
                    break;
            }
        }
    }

    private void afisarepayroll() {
        System.out.println("payrollurile existente:");
        List<Payroll> payrolls = repositoryPayroll.allPayrolls();
        for (Payroll payroll : payrolls) {
            System.out.println(payroll.toString());
        }
    }

    private void modificareOvertimePay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul:");
        int id = scanner.nextInt();
        System.out.println("Introduceti overTimePay-ul:");
        int overTimePay = scanner.nextInt();
        repositoryPayroll.updateOvertimePay(id, overTimePay);
    }

    private void stergerepayrollDupaId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul payrollului:");
        int id = scanner.nextInt();
        repositoryPayroll.stergePayrollById(id);
    }

    private void adaugarepayroll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti employeedID-ul:");
        int employeeId = scanner.nextInt();
        System.out.println("Introduceti number of days:");
        int numOfDaysWork = scanner.nextInt();
        System.out.println("Introduceti bonus-ul:");
        int bonus = scanner.nextInt();
        System.out.println("Introduceti overtime pay-ul:");
        int overtimePay = scanner.nextInt();
        System.out.println("Introduceti salariul brut-ul:");
        int grosssalary = scanner.nextInt();
        System.out.println("Introduceti cash advance-ul:");
        int cassadvance = scanner.nextInt();
        System.out.println("Introduceti late hours:");
        int latehours = scanner.nextInt();
        System.out.println("Introduceti cash absent days:");
        int absentDays = scanner.nextInt();
        System.out.println("Introduceti payroll month:");
        int payrollMonth = scanner.nextInt();

        Payroll payroll = new Payroll(employeeId, numOfDaysWork, bonus, overtimePay, grosssalary, cassadvance,
                latehours, absentDays, payrollMonth);

        repositoryPayroll.insertPayroll(payroll);
    }
}
