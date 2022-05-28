package model;

public class Position {
    private int id;
    private String name;
    private int dailyrate;
    private int monthlyrate;
    private  int workingDaysPerMonth;

    public  Position(String name, int dailyrate,int monthlyrate,int workingDaysPerMonth){
        this.name=name;
        this.dailyrate=dailyrate;
        this.monthlyrate=monthlyrate;
        this.workingDaysPerMonth=workingDaysPerMonth;
    }

    public  Position(int id,String name, int dailyrate,int monthlyrate,int workingDaysPerMonth){
        this.id=id;
        this.name=name;
        this.dailyrate=dailyrate;
        this.monthlyrate=monthlyrate;
        this.workingDaysPerMonth=workingDaysPerMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }

    public int getMonthlyrate() {
        return monthlyrate;
    }

    public void setMonthlyrate(int monthlyrate) {
        this.monthlyrate = monthlyrate;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+","+dailyrate+","+monthlyrate+","+workingDaysPerMonth;
        return  text;
    }

    @ Override
    public  boolean equals(Object obj){
        Position position=(Position) obj;
        return  position.monthlyrate==this.monthlyrate;
    }
}
