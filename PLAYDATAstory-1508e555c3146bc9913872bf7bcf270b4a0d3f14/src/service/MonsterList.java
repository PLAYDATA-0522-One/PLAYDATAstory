package service;

import domain.ConditonDto;
import repository.ConditionRepository;
import repository.MonsterRepository;

public class MonsterList {
    private static MonsterList monster;

    public static MonsterList getInstance() {
        if (monster == null) monster = new MonsterList();
        return monster;
    }


    public void checkMonster(){

        new MonsterRepository().checkMonster();
    }
    public void checkAllMonster(){


        new MonsterRepository().checkAllMonster();
    }
    public void inputAllmonster(){


        new MonsterRepository().inputAllmonster();
    }
    public void printAllmonster()
    {
        new MonsterRepository().printAllmonster();
    }

}
