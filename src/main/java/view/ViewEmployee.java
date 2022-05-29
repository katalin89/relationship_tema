package view;

import model.Employee;

import java.util.List;
import java.util.Scanner;

import static view.View.*;

public class ViewEmployee {

    Employee employee;

    public ViewEmployee(){
         employee = new Employee("hg723986573","Moraru","Razvan","Vlad","1998.03.02","Retezatului nr 5","0873635",true,2);
    }

    public void meniu(){
        System.out.println("Apasa tasta 1 pentru a creea un employee.");
        System.out.println("Apasa tasta 2 pentru sterge un employee dupa id.");
        System.out.println("Apasa tasta 3 pentru a modifica barcode-ul.");
        System.out.println("Apasa tasta 5 pentru afisa toate employeeurile.");
    }

    public  void play(){
        boolean run=true;
        int alege=0;
        Scanner scanner=new Scanner(System.in);
        while(run==true){
            meniu();
            alege=Integer.parseInt(scanner.nextLine());
            switch (alege){
                case 1: adaugareemployee();
                    break;
                case 2: stergereemployeeDupaId();
                    break;
                case 3: modificareBarcode();
                    break;
                case 5: afisareemployee();
                    break;
            }
        }
    }

    private void afisareemployee() {
        System.out.println("employeeurile existente:");
        List<Employee> employees = repositoryEmployee.allEmployees();
        for (Employee employee :employees ){
            System.out.println(employee.toString());
        }
    }
    
    private void modificareBarcode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul:");
        int id = scanner.nextInt();
        scanner.nextLine();// sa citesca enterul
        System.out.println("Introduceti barcode-ul:");
        String barcode = scanner.nextLine();
        repositoryEmployee.updateBarcode(id,barcode);
    }

    private void stergereemployeeDupaId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul employeeului:");
        int id = scanner.nextInt();
        repositoryEmployee.stergeEmployeeById(id);
    }

    private void adaugareemployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti barcode-ul:");
        String barcode=scanner.nextLine();
        System.out.println("Introduceti lastName :");
        String lastName=scanner.nextLine();
        System.out.println("Introduceti firstName:");
        String firstName=scanner.nextLine();
        System.out.println("Introduceti middleName :");
        String middleName=scanner.nextLine();
        System.out.println("Introduceti data nasteri:");
        String dateOfBirth=scanner.nextLine();
        System.out.println("Introduceti adresa :");
        String address=scanner.nextLine();
        System.out.println("Introduceti contact:");
        String contact=scanner.nextLine();
        System.out.println("Introduceti status :");
        boolean status=scanner.nextBoolean();
        System.out.println("Introduceti positionId:");
        int positionId=scanner.nextInt();
        Employee employee = new Employee(barcode,lastName, firstName, middleName, dateOfBirth, address, contact, status, 
                positionId);
        repositoryEmployee.insertEmployee(employee);
    }
}
