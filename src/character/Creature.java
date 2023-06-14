package character;

public class Creature {
    private int hp;
    private int attackpoint;

    public Creature(int hp,int attackpoint)
    {
        this.hp=hp;
        this.attackpoint=attackpoint;
        System.out.println("st");

    }

    public int getHp() { // 내 현재 hp 불러올때 필요
        return hp;
    }

    public void setHp(int hp) { // 포션 먹을 때 필요함 .
        this.hp = hp;
    }

    public int getAttackpoint() { //어택포인트 연산에 필요
        int attackValue = (int) (attackpoint * Math.random()) ;
        return attackValue;
    }

//    public void setAttackpoint(int attackpoint) { // 장비 착용에 필요.
//        this.attackpoint = attackpoint;
//    } //굳이 set 에서 안바꿔도됨


    public String getDamage (Creature creature) {
        hp = hp - creature.getAttackpoint();
        return creature.getAttackpoint() + "의 데미지를 받았습니다.";
    }
}