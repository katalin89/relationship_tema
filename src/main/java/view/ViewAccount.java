package view;

import model.Account;

import java.util.List;
import java.util.Scanner;
import static view.View.*;

public class ViewAccount {

    Account account;

    public ViewAccount(){
        account = new Account(1,"adi","222","admin");
    }

    public  void meniu(){
        System.out.println("Apasa tasta 1 pentru a creea un account.");
        System.out.println("Apasa tasta 2 pentru sterge un account dupa id.");
        System.out.println("Apasa tasta 3 pentru a modifica password.");
        System.out.println("Apasa tasta 4 pentru stergere unui account dupa nume.");
        System.out.println("Apasa tasta 5 pentru afisa toate accounturile.");
    }

    public  void play(){
        boolean run=true;
        int alege=0;
        Scanner scanner=new Scanner(System.in);
        while(run==true){
            meniu();
            alege=Integer.parseInt(scanner.nextLine());
            switch (alege){
                case 1: adaugareAccount();
                    break;
                case 2: stergereAccountDupaId();
                    break;
                case 3: modificarePassword();
                    break;
                case 4: stergereAccountDupaNume();
                    break;
                case 5: afisareAccount();
                    break;
            }
        }
    }

    private void afisareAccount() {
        System.out.println("Accounturile existente:");
        List<Account> accounts = repositoryAccount.allAccounts();
        for (Account account :accounts ){
            System.out.println(account.toString());
        }
    }

    private void stergereAccountDupaNume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtroduceti numele accountului:");
        String nume = scanner.nextLine();
        repositoryAccount.deleteUsername(nume);
    }

    private void modificarePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul:");
        int id = scanner.nextInt();
        System.out.println("Introduceti password-ul:");
        String password = scanner.nextLine();
        repositoryAccount.updatePassword(id,password);
    }

    private void stergereAccountDupaId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtroduceti id-ul accountului:");
        int id = scanner.nextInt();
        repositoryAccount.stergeAccountById(id);
    }

    private void adaugareAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtroduceti numele accountului");
        String name=scanner.nextLine();
        System.out.println("Indtroduceti passwordul :");
        String password=scanner.nextLine();
        System.out.println("Indtroduceti type-ul:");
        String type=scanner.nextLine();
        Account account = new Account(name,password,type);
        repositoryAccount.insertAccount(account);
    }
}
