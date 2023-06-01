package field;

import creature.Creature;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Field {
    static Scanner sc;


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
    public void selectmode()
    {
        System.out.println("원하는 필드를 선택하시오 1. 전투 , 2. 상점 , 3. 퀘스트, 4. 나가기");
        int i=Integer.parseInt(sc.nextLine());
        if(i==1)
        {


            selectmode();
        }
        else if(i ==2)
        {
            selectmode();
        }
        else if(i==3)
        {
            selectmode();
        }
        else {

        }

    }

}