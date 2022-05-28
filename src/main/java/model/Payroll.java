package model;

public class Payroll {
    private int id;
    private int employeeId;
    private  int numOfDaysWork;
    private int bonus;
    private int overtimePay;
    private int grosssalary;
    private int cassadvance;
    private int latehours;
    private int absentDays;
    private int payrollMonth;

    public  Payroll(int employeeId,int numOfDaysWork,int bonus,int overtimePay,int grosssalary,int cassadvance,int latehours,int absentDays,int  payrollMonth){

        this.employeeId=employeeId;
        this.numOfDaysWork=numOfDaysWork;
        this.bonus=bonus;
        this.overtimePay=overtimePay;
        this.grosssalary=grosssalary;
        this.cassadvance=cassadvance;
        this.latehours=latehours;
        this.absentDays=absentDays;
        this.payrollMonth=payrollMonth;
    }

    public  Payroll(int id,int employeeId,int numOfDaysWork,int bonus,int overtimePay,int grosssalary,int cassadvance,int latehours,int absentDays,int payrollMonth){
        this.id=id;
        this.employeeId=employeeId;
        this.numOfDaysWork=numOfDaysWork;
        this.bonus=bonus;
        this.overtimePay=overtimePay;
        this.grosssalary=grosssalary;
        this.cassadvance=cassadvance;
        this.latehours=latehours;
        this.absentDays=absentDays;
        this.payrollMonth=payrollMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getNumOfDaysWork() {
        return numOfDaysWork;
    }

    public void setNumOfDaysWork(int numOfDaysWork) {
        this.numOfDaysWork = numOfDaysWork;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(int overtimePay) {
        this.overtimePay = overtimePay;
    }

    public int getGrosssalary() {
        return grosssalary;
    }

    public void setGrosssalary(int grosssalary) {
        this.grosssalary = grosssalary;
    }

    public int getCassadvance() {
        return cassadvance;
    }

    public void setCassadvance(int cassadvance) {
        this.cassadvance = cassadvance;
    }

    public int getLatehours() {
        return latehours;
    }

    public void setLatehours(int latehours) {
        this.latehours = latehours;
    }

    public int getAbsentDays() {
        return absentDays;
    }

    public void setAbsentDays(int absentDays) {
        this.absentDays = absentDays;
    }

    public int getPayrollMonth() {
        return payrollMonth;
    }

    public void setPayrollMonth(int payrollMonth) {
        this.payrollMonth = payrollMonth;
    }

    @Override
    public  String toString(){
        String text="" ;
        text+=id+","+employeeId+","+numOfDaysWork+","+bonus+","+overtimePay+","+grosssalary+","+cassadvance+","+latehours+","+absentDays+","+payrollMonth;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Payroll payroll=(Payroll)  obj;
        return  payroll.numOfDaysWork==this.numOfDaysWork;

    }
}
