package character;

public class Creature {
    private int hp;
    private int nowHp;
    private int attackpoint;

    Position position;


    public Creature(int hp,int attackpoint)
    {   this.nowHp = hp;
        this.hp=hp;
        this.attackpoint=attackpoint;

    }

    public int getHp() { // 내 현재 hp 불러올때 필요
        return hp;
    }

    public int getNowHp(){return nowHp;}

    public void setNowHp(int hp) { // 포션 먹을 때 필요함 .
        this.nowHp = hp;
    }


    public int getAttackpoint() { // 내 현재 hp 불러올때 필요
        return attackpoint;
    }
    public void setAttackpoint(int attackpoint) { // 내 현재 hp 불러올때 필요
        this.attackpoint = attackpoint;
    }


    public void GetAttackpoint(int attackpoint) { // 포션 먹을 때 필요함 .
        this.attackpoint = attackpoint;
    }

    public int makeAttackpoint() { //어택포인트 연산에 필요
        int attackValue = (int) (attackpoint * Math.random()) ;
        return attackValue;
    }

//    public void setAttackpoint(int attackpoint) { // 장비 착용에 필요.
//        this.attackpoint = attackpoint;
//    } //굳이 set 에서 안바꿔도됨


    public String getDamage (Creature creature) {
        nowHp = nowHp - creature.getAttackpoint();
    return creature.getAttackpoint() + "의 데미지를 받았습니다.";
    }
}