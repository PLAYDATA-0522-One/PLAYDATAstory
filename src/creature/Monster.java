package creature;

public class Monster extends Creature {
    int sheid =10;

    public Monster(String id, int hp, int attack_point, int sheid) {
        super(id, hp, attack_point);
        this.sheid = sheid;
    }

}