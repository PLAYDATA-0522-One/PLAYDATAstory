package character;

<<<<<<< HEAD
public class Human extends Creature {
    public static boolean isCreated = false;
    Jobclass job;

    public Human(int hp, int AttackPoint, Jobclass job) {
        super(hp,AttackPoint);
    }
    public static void setCreated()
    {
        Human.isCreated = true;
=======
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

>>>>>>> taeyeol
    }

}

<<<<<<< HEAD
=======

>>>>>>> taeyeol
