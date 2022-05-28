package repository;

import model.Employee;
import model.Payroll;
import org.junit.jupiter.api.Test;

import java.util.List;

class RepositoryPayrollTest {
    @Test
    public  void  insert(){
       RepositoryPayroll repositoryPayroll=new RepositoryPayroll();
        Payroll payroll=new Payroll(1,20,100,0,9000,300,4,3,20);
        repositoryPayroll.insertPayroll(payroll);

    }

    @Test
    public  void sterge(){
        RepositoryPayroll repositoryPayroll=new RepositoryPayroll();
        repositoryPayroll.stergePayrollById(5);
    }

    @Test
    public  void update(){
        RepositoryPayroll repositoryPayroll=new RepositoryPayroll();
        repositoryPayroll.updateOvertimePay(4,100);
    }

    @Test
    public  void delete(){
        RepositoryPayroll repositoryPayroll=new RepositoryPayroll();
        repositoryPayroll.deleteEmployeeId(4);
    }

    @Test
    public void allList() {
        RepositoryEmployee repositoryEmployee= new RepositoryEmployee();
        List<Employee> employees=repositoryEmployee.allEmployees();
        for(Employee e:employees){
            System.out.println(e.toString());
        }
    }


}