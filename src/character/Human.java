package character;


public class Human  extends Creature {
    Inventory inventory;
    Position position;






    String job;


    public Human(int hp, int AttackPoint, String job) {
        super(hp,AttackPoint);
    }
    public void setStatus(Human human){
        this.setNowHp((human.getHp()));
        this.setAttackpoint(human.getAttackpoint());


    }

}

