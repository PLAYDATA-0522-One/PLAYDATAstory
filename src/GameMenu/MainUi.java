package GameMenu;

import character.Human;
import Map.Move;

import java.util.Scanner;

public class MainUi {
    private static MainUi mainUi;
    private boolean GameStartBit = false;
    Scanner sc = new Scanner(System.in);

    public  static MainUi getInstance() {
        if (mainUi == null) mainUi = new MainUi();
        return mainUi;
    }


        public void selectMenu (){

            System.out.println("1. 게임시작 2. 게임 종료"); // 프린트 값 다시 설정하기
            int num = Integer.parseInt(sc.nextLine()); // num을 적절한 말로 바꿔주시오
            dataProcess(num);
        }
        public void dataProcess ( int num){
            if (num == 1) {
                GameStartBit = true;
            } else return;
            // -> 게임 시작 게임 비트를 on 할 예정
        }

        public boolean isGameStartBit() {
            return GameStartBit;
             }

    public void 게임시작및캐릭터생성 () {
            if (!GameStartBit) {
                selectMenu(); //-> 게임 시작 / 게임 종료  // 게임 시작 -> Static bit on : Gamestart
            }
           else if (GameStartBit) {
                new MakeCharacter().makeHuman();
            }
        }
    }

