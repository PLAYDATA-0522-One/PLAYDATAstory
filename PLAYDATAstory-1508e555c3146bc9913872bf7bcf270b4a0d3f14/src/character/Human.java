package character;

public class Human  extends Creature {


    Jobclass job;


    public Human(int hp, int AttackPoint) {
        super(hp,AttackPoint);
    }
    public void setStatus(Human human){
        this.setHp(human.getHp());
        this.setAttackpoint(human.getAttackpoint());

    }
}


