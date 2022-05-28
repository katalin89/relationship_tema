package view;

import repository.RepositoryAccount;
import repository.RepositoryEmployee;
import repository.RepositoryPayroll;
import repository.RepositoryPosition;

public interface View {
    RepositoryAccount repositoryAccount=new RepositoryAccount();
    RepositoryEmployee repositoryEmployee=new RepositoryEmployee();
    RepositoryPayroll repositoryPayroll=new RepositoryPayroll();
    RepositoryPosition repositoryPosition=new RepositoryPosition();

}
