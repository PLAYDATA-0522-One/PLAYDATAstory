package character;

<<<<<<< HEAD
public class Monster extends Creature {
    int sheid =10;

    public Monster(int hp, int attack_point, int sheid) {
        super(hp, attack_point);
        this.sheid = sheid;
    }

}


=======
public class Monster extends Creature{
    Position position;

    String name;
    public Monster(String name,int hp, int AttackPoint) {
        super(hp,AttackPoint);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(){
       int mode  = (int) (Math.random()*10);

       if( 0 <= mode && mode <= 5 ){
           position = Position.ATTACK;
       }
       else if(6 <= mode ){
           position = Position.DEFENCE;
       }
    }
    public Position getPosition() {
        return position;
    }
}
>>>>>>> taeyeol
