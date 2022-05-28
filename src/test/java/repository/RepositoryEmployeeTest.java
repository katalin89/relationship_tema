package repository;

import model.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryEmployeeTest {

    @Test
    public  void  insert(){
        RepositoryEmployee repositoryEmployee= new RepositoryEmployee();
        Employee employee=new Employee("hg723986573","Moraru","Razvan","Vlad","1998.03.02","Retezatului nr 5","0873635",true,2);
        repositoryEmployee.insertEmployee(employee);

    }

    @Test
    public  void sterge(){
        RepositoryEmployee repositoryEmployee= new RepositoryEmployee();
        repositoryEmployee.stergeEmployeeById(5);


    }

    @Test
    public  void update(){
        RepositoryEmployee repositoryEmployee= new RepositoryEmployee();
        repositoryEmployee.updateBarcode(6,"en222");
    }

    @Test
    public  void deleteLastName(){
        RepositoryEmployee repositoryEmployee= new RepositoryEmployee();
        repositoryEmployee.deleteLastName("Moraru");
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