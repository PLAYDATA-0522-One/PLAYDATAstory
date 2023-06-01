package creature;

public class Human extends Creature{
    String job="myjob";
    public Human(String id, int hp, int attack_point) {
        super(id, hp, attack_point);
        this.job=job;
    }

}
