package creature;

abstract public class Monster extends Creature {
    int sheid =10;
    public Monster() {
        super(50, 5, "snail");
        this.sheid=sheid;
    }
    //@Override

    ///필수 요소
    // 공격력
    // 체력
    abstract int AttackPoint();
//       = this.공격력 * (랜덤요소);
//
//       return 공격력;
}