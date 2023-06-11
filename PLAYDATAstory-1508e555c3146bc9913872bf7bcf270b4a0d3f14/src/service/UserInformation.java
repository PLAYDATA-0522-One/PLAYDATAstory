package service;

import domain.ConditonDto;
import domain.InformationDto;
import repository.ConditionRepository;
import repository.InformationRepository;

public class UserInformation {
    public void checkUserInformation(){


        new InformationRepository().checkUserInformation();
    }
    public void changeUserConditon(InformationDto dto){


        new InformationRepository().checkUserInformation(dto);
    }
}
