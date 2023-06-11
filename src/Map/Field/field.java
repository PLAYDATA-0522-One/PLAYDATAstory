package Map.Field;

import building.Town;
import character.Human;

import java.util.Scanner;

public class field {

    Scanner sc = new Scanner(System.in);
    Town town = new Town(sc);
    int Type;

    //몬스터 테이블 만들어야함.
    boolean Clear = false;

    public field() {
        this.Type =(int) (Math.random()*9);
    } // 0<math < 3

    public void eventGeneration(){
        if( (0 <= Type) && (Type <= 6)  ){
            battleOn();
        } else if ( 7 <= Type && Type <= 9) {
            goToTown();
        } else{

        }
        //클래스.갱신함수();
        //갱신함수() {
        // 1차(); - > 캐릭터 상태 업데이트
           // if(c)
        // 2차();
        // 3차();
        // };
    }

    public void battleOn() {
        System.out.println("전투");
    }
    public void 보스() {
        System.out.println("보스");
    }
    public void goToTown() {
        System.out.println("여기는 마을 입니다. 행동을 정해주세요.");
        System.out.println("1. 상점가기 2. 회복하기");
        int mode = Integer.parseInt(sc.nextLine());
        townSituation(mode);
    }
    public void townSituation(int mode) {
    if(mode == 1){
        town.enterShop();
    }
    else if(mode == 2){
        town.enterTemple();
    }else{
        System.out.println("잘못된 선택입니다. 다시 골라주세요.");
        goToTown();
    }
    }
}
