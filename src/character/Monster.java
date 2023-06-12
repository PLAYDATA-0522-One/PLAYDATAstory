package character;

public class Monster extends Creature{


    String name;
    public Monster(String name,int hp, int AttackPoint) {
        super(hp,AttackPoint);
        this.name=name;
    }

    public String getName() {
        return name;
    }

}