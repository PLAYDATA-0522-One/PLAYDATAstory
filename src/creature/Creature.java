package creature;

public class Creature {
    private int hp;
    private int attackpoint;
    private String name;
    public Creature(int hp, int attackpoint, String name)
    {
        this.hp=hp;
        this.attackpoint=attackpoint;
        this.name=name;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackpoint() {
        return attackpoint;
    }

    public void setAttackpoint(int attackpoint) {
        this.attackpoint = attackpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDamage (Creature creature) {
        hp = hp - creature.getAttackpoint();// 어제는 this를 붙였다 근데 위에 이름과 겹치는 이름이 없어서 안써도 된다
        return name+"가"+creature.getName() + "이" + creature.getAttackpoint()+"딜을 받았습니다";
    }
}
