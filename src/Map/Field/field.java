package Map.Field;

import character.Human;

import java.util.Scanner;

public class field {

    Scanner sc = new Scanner(System.in);

    int Type;

    //몬스터 테이블 만들어야함.
    boolean Clear = false;

    public field() {
        this.Type =(int) (Math.random()*3);
    } // 0<math < 3

    public void eventGeneration(){
        if(Type == 0){
            전투();
        } else if (Type ==1) {
            마을();
        } else if (Type == 2) {
            //중간보스(); //예시
        }
        //클래스.갱신함수();
        //갱신함수() {
        // 1차(); - > 캐릭터 상태 업데이트
           // if(c)
        // 2차();
        // 3차();
        // };
    }

    public void 전투() {
    }
    public void 보스() {
    }
    public void 마을() {
        System.out.println("여기는 마을 입니다. 행동을 정해주세요.");
        System.out.println("1. 상점가기 2. 회복하기");
        int mode = Integer.parseInt(sc.nextLine());
        마을ACT(mode);
    }
    public void 마을ACT(int mode) {
    if(mode == 1){
        //town.함수();
    }
    else if(mode == 2){

    }else{
        System.out.println("잘못된 선택입니다. 다시 골라주세요.");
        마을();
    }
    }
}
