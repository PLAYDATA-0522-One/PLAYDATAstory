package character;

public class Monster extends Creature {
    int sheid =10;

    public Monster(int hp, int attack_point, int sheid) {
        super(hp, attack_point);
        this.sheid = sheid;
    }

}


