package repository;

import model.Position;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryPositionTest {

    @Test

    public  void  insert(){
        RepositoryPosition repositoryPosition=new RepositoryPosition();
        Position position=new Position(1,"manager",8,160,20);
        repositoryPosition.insertPosition(position);
    }

    @Test
    public  void delete(){
        RepositoryPosition repositoryPosition=new RepositoryPosition();
        repositoryPosition.stergePayrollById(9);
    }

    @Test
    public  void  update(){
        RepositoryPosition repositoryPosition=new RepositoryPosition();
        repositoryPosition.update(1,150);
    }

    @Test
    public  void  deletePosName(){
        RepositoryPosition repositoryPosition=new RepositoryPosition();
        repositoryPosition.deletePositionName("manager");
    }

    @Test
    public  void all(){
        RepositoryPosition repositoryPosition=new RepositoryPosition();
        List<Position> positions=repositoryPosition.allPositions();
        for(Position p:positions){
            System.out.println(p.toString());
        }
    }



}