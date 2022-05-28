package repository;

import model.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryAccountTest {
    @Test
    public  void  insert(){
        RepositoryAccount repositoryAccount= new RepositoryAccount();
        Account account=new Account("Gabriela","345","user");
        repositoryAccount.insertAccount(account);

    }

    @Test
    public  void sterge(){
        RepositoryAccount repositoryAccount= new RepositoryAccount();
        repositoryAccount.stergeAccountById(11);


    }

    @Test
    public  void update(){
        RepositoryAccount repositoryAccount= new RepositoryAccount();
        repositoryAccount.updatePassword(1,"222");
    }

    @Test
    public  void deleteUsername(){
        RepositoryAccount repositoryAccount= new RepositoryAccount();
        repositoryAccount.deleteUsername("Gabriela");
    }

    @Test
    public void allList() {

        RepositoryAccount repositoryAccount= new RepositoryAccount();
        List<Account>accounts=repositoryAccount.allAccounts();
        for(Account a:accounts){
            System.out.println(a.toString());
        }


    }


}