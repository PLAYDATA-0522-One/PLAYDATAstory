package creature;

public class Creature {
    private String id;
    private int hp;
    private int attack_point;
    public Creature(String id, int hp, int attack_point)
    {
        this.id=id;
        this.hp=hp;
        this.attack_point=attack_point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack_point() {
        return attack_point;
    }

    public void setAttack_point(int attack_point) {
        this.attack_point = attack_point;
    }

}
