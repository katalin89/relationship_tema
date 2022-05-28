package repository;

import model.Position;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryPosition extends Repository{
    public  RepositoryPosition(){
        super();
    }

    public  void insertPosition(Position position){
        String insertTo="";
        insertTo+="insert into position (positionName, dailyrate, monthlyrate, workingdayspermonths) values (";
        insertTo+=String.format("'%s','%d','%s','%s'",position.getName(),position.getDailyrate(),position.getMonthlyrate(),position.getWorkingDaysPerMonth());
        insertTo+=")";
        executeStatement(insertTo);
    }

    public  void stergePayrollById(int id){
        String text= String.format("delete from position where id = %d",id);
        executeStatement(text);
    }

    public  void update(int id,int monthlyrate){
        String update="";
        update+=String.format("update position set monthlyrate = %d",monthlyrate);
        update+=String.format(" where id= %d",id);
        executeStatement(update);
    }

    public  void deletePositionName(String  positionName){
        String delete="";
        delete+=String.format("delete from position where positionName = '%s'",positionName);
        executeStatement(delete);
    }

    private ResultSet allPosition(){
        executeStatement("select * from payroll");
        try{
            return  statement.getResultSet();
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public List<Position> allPositions() {
        ResultSet set = allPosition();
        List<Position> positions = new ArrayList<>();
        try{
            while (set.next()){
                positions.add(new Position(set.getInt(1),set.getString(2), set.getInt(3), set.getInt(4),set.getInt(5) ));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat lista");
        }
        return  positions;
    }
}
