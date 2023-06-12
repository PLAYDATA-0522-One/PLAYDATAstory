package character;
public class Human  extends Creature {
    private int nowHp;
    Jobclass job;
    public Human(int hp, int AttackPoint, String job) {
        super(hp,AttackPoint);
        nowHp = hp;
    }
    public void setStatus(Human human){
        this.setNowHp((human.getHp()));
        this.setAttackpoint(human.getAttackpoint());
    }
}