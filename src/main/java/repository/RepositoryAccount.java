package repository;

import model.Account;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryAccount extends  Repository {

    public RepositoryAccount() {
        super();
    }

    public void insertAccount(Account account) {
        String insertTo = "";
        insertTo += "insert into  account ( username, password, accounttype) VALUES (";
        insertTo += String.format("'%s','%s','%s'", account.getUsername(), account.getPassword(), account.getAccounttype());
        insertTo += ")";
        executeStatement(insertTo);

    }
    public void stergeAccountById(int id){
        String text=String.format("delete from account where  id=%d",id);
        executeStatement(text);
    }
    public  void updatePassword(int id,String password){
        String update="";
        update+=String.format("update account set password= '%s'",password);
        update+=String.format("where id='%s'",id);
        executeStatement(update);
    }

    public  void deleteUsername(String username){
        String delete="";
        delete+= String.format("delete from account  where username = '%s'",username);
        executeStatement(delete);
    }

    private ResultSet allAccount(){
        executeStatement("select *from account");
        try{
            return  statement.getResultSet();

        }catch ( Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Account> allAccounts(){
        ResultSet set=allAccount();
        List<Account> accounts=new ArrayList<>();
        try{
            while (set.next()){
                accounts.add(new Account(set.getInt(1),set.getString(2),set.getString(3),set.getString(4)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat  lista");
        }
        return  accounts;
    }

}

