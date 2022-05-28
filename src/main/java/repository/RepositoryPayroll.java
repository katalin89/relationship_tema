package repository;

import model.Payroll;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryPayroll  extends  Repository{
    public RepositoryPayroll() {
        super();
    }

    public void insertPayroll(Payroll payroll) {
        String insertTo = "";
        insertTo += "insert into payroll( employee_id, numOfDaysWork, bonus, overtimePay, grosssalary, cashadvance, " +
                "latehours, absentdays, payrollmonth) values (";
        insertTo += String.format("%d,%d,%d,%d,%d,%d,%d,%d,%d", payroll.getEmployeeId(), payroll.getNumOfDaysWork(),
                payroll.getBonus(),payroll.getOvertimePay(),payroll.getGrosssalary(),
                payroll.getCassadvance(),payroll.getLatehours(),payroll.getAbsentDays(),payroll.getPayrollMonth());
        insertTo += ")";
        executeStatement(insertTo);
/*    private int id;
    private int employeeId;
    private  int numOfDaysWork;
    private int bonus;
    private int overtimePay;
    private int grosssalary;
    private int cassadvance;
    private int latehours;
    private int absentDays;*/

    }
    public  void stergePayrollById(int id){
        String text=String.format("delete from payroll where  id=%d",id);
        executeStatement(text);
    }
    public  void update(int id,int  overtimePay){
        String update="";
        update+=String.format("update payroll set overtimePay= %d",overtimePay);
        update+=String.format(" where id=%d",id);
        executeStatement(update);
    }

    public  void deleteEmployeeId(int employeeId){
        String delete="";
        delete+= String.format("delete from payroll  where employee_id = %d",employeeId);
        executeStatement(delete);
    }

    private ResultSet allPayroll(){
        executeStatement("select *from payroll");
        try{
            return  statement.getResultSet();

        }catch ( Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Payroll> allPayrolls(){
        ResultSet set=allPayroll();
        List<Payroll> payrolls=new ArrayList<>();
        try{
            while (set.next()){
                payrolls.add(new Payroll(set.getInt(1),set.getInt(2), set.getInt(3), set.getInt(4), set.getInt(5), set.getInt(6),set.getInt(7) , set.getInt(8), set.getInt(9)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat  lista");
        }
        return  payrolls;
    }



}
