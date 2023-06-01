package MainUi;

import java.util.Scanner;

public class MainUi {
    private static boolean GameStartBit = false;
    public void selectMenu(Scanner sc){

        System.out.println("1. 게임시작 2. 게임 종료"); // 프린트 값 다시 설정하기
        int num =  Integer.parseInt(sc.nextLine()); // num을 적절한 말로 바꿔주시오
        dataProcess(num);
    }

    public void dataProcess(int num){
        if(num == 1){
            setGameStartBit(true);
      } else return;
            // -> 게임 시작 게임 비트를 on 할 예정
    }
    public static void setGameStartBit(boolean gameStartBit) {
        GameStartBit = gameStartBit;
        return;
    }

    public static boolean isFineGameStart() {
        return GameStartBit;
    }
}
