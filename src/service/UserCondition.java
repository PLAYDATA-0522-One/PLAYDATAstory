package service;

import domain.ConditonDto;
import domain.SignupDto;
import repository.ConditionRepository;
import repository.UserRepository;

public class UserCondition {
    private static UserCondition service;

    public static UserCondition getInstance() {
        if (service == null) service = new UserCondition();
        return service;
    }

    public void checkUserConditon(){


        new ConditionRepository().checkUserConditon();
    }
    public void changeUserConditon(ConditonDto dto){


        new ConditionRepository().changeUserConditon(dto);
    }

}