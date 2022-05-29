import model.Employee;
import model.Payroll;
import model.Position;
import repository.Repository;
import view.ViewAccount;
import view.ViewEmployee;
import view.ViewPayroll;
import view.ViewPosition;

public class Main {
    public static void main(String[] args) {
        Repository repository;
//        ViewAccount viewAccount = new ViewAccount();
//        viewAccount.play();
//
//        ViewEmployee viewEmployee = new ViewEmployee();
//        viewEmployee.play();

        ViewPayroll viewPayroll = new ViewPayroll();
        viewPayroll.play();

//        ViewPosition viewPosition=new ViewPosition();
//        viewPosition.play();
    }
}