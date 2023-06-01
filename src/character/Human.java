package character;

public class Human extends Creature {
    public static boolean isCreated = false;
    Jobclass job;

    public Human(int hp, int AttackPoint, Jobclass job) {
        super(hp,AttackPoint);
    }
}

