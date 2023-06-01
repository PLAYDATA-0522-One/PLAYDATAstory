//package field;
//
//import creature.Creature;
//
//public class Field extends Creature {
//    public Field(int hp, int attackpoint, String name) {
//        super(hp, attackpoint, name);
//    }
//    @Override //덮어쓰다
//    public String getDamage() {
//        if(shield < 0) { //쉴드가 전부 깎이면 hp가 데미지를 입는다
//            return super.getDamage(unit);
//        }else { //아니면 쉴드가 깎인다
//            shield -= unit.getAttackPoint();
//        }
////			super.setHp(super.getHp()-unit.getAttackPoint());
////			return super.getName()+"가"+unit.getName() + "한테" + unit.getAttackPoint()+"딜을 받았습니다";
//        return super.getName()+"가"+unit.getName() + "한테" + unit.getAttackPoint()+"딜을 받았습니다";
//}