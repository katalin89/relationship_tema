package repository;

import model.Employee;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee  extends  Repository{

    public RepositoryEmployee() {
        super();
    }

    public void insertEmployee(Employee employee) {
        String insertTo = "";
        insertTo += " insert into employee( barcode, lastname, firstname, middlename, dateOfBirth, address, contact, status, position_id) values (";
        insertTo += String.format("'%s','%s','%s', '%s','%s','%s','%s',%b,%d", employee.getBarcode(), employee.getLastName(), employee.getFirstName(),employee.getMiddleName(),employee.getDateOfBirth(),employee.getAddress(),employee.getContact(),employee.isStatus(),employee.getPositionId());
        insertTo += ")";
        executeStatement(insertTo);
    }


    public  void stergeEmployeeById(int id){
        String text=String.format("delete from employee where  id=%d",id);
        executeStatement(text);
    }
    public  void updateBarcode(int id,String barcode){
        String update="";
        update+=String.format("update employee set barcode= '%s'",barcode);
        update+=String.format("where id='%s'",id);
        executeStatement(update);
    }

    public  void deleteLastName(String lastName){
        String delete="";
        delete+= String.format("delete from employee  where lastname = '%s'",lastName);
        executeStatement(delete);
    }

    private ResultSet allEmployee(){
        executeStatement("select *from employee");
        try{
            return  statement.getResultSet();

        }catch ( Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Employee> allEmployees(){
        ResultSet set=allEmployee();
        List<Employee> employees=new ArrayList<>();
        try{
            while (set.next()){
                employees.add(new Employee(set.getInt(1),set.getString(2), set.getString(3), set.getString(4),set.getString(5),set.getString(6),set.getString(7),set.getString(8),set.getBoolean(9),set.getInt(10)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat  lista");
        }
        return  employees;
    }
}
