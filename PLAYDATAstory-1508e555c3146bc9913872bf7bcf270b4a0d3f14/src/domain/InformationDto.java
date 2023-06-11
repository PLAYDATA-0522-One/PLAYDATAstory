package domain;

public class InformationDto {

    private int exp;
    private int hp;
    private int attackpoint;

    public InformationDto(int exp, int hp, int attackpoint) {
        this.exp = exp;
        this.hp = hp;
        this.attackpoint = attackpoint;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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
}
