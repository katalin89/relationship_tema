package view;

import model.Position;

import java.util.List;
import java.util.Scanner;

import static view.View.repositoryPosition;

public class ViewPosition {
    Position position;

    public  ViewPosition(){
        position=new Position(10,"HR",8,160,20);
    }

    public  void meniu(){
        System.out.println("Apasa tasta 1 pentru a crea un position");
        System.out.println("Apasa tasta 2 pentru a sterge un position dupa id");
        System.out.println("Apasa tasta 3 pentru a modifica monthlyrate");
        System.out.println("Apasa tasta 4 pentru a afisa toate positionurule ");

    }
    public  void play(){
        boolean run= true;
        int alege=0;
        Scanner scanner=new Scanner(System.in);
        while(run==true){
            meniu();
            alege=Integer.parseInt(scanner.nextLine());
            switch ( alege){
               case 1:adaugarePosition();
               break;
                case 2:stergePayrollDupaId();
                break;
                case 3:modificaMotnhlyrate();
                break;
                case 4:afisarePayroll();
                break;
            }
        }
    }

    public  void adaugarePosition(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti positionName");
        String positinName=scanner.nextLine();
        System.out.println("Introduceti dailyRate");
        int dailyrate=scanner.nextInt();
        System.out.println("Introduceti monthlyrate");
        int monthlyrate=scanner.nextInt();
        System.out.println("Introduceti workingdayspermonths");
        int  workindayspermonths=scanner.nextInt();

        Position position=new Position(positinName,dailyrate,monthlyrate,workindayspermonths);
        repositoryPosition.insertPosition(position);
    }

    private void stergePayrollDupaId(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id ul positionului");
        int id= scanner.nextInt();
        repositoryPosition.stergePayrollById(id);
        System.out.println("S-a sters");

    }

    public  void modificaMotnhlyrate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id ");
        int id= scanner.nextInt();
        System.out.println("introduceti monthlyrate");
        int monthlyrate= scanner.nextInt();
        repositoryPosition.update(id,monthlyrate);

    }

    private void afisarePayroll(){
        System.out.println("Positionurile existente");
        List<Position>positions=repositoryPosition.allPositions();
        for(Position position:positions){
            System.out.println(position.toString());
        }
    }
}
/*


    private void afisarepayroll() {
        System.out.println("payrollurile existente:");
        List<Payroll> payrolls = repositoryPayroll.allPayrolls();
        for (Payroll payroll : payrolls) {
            System.out.println(payroll.toString());
        }
    }






*/