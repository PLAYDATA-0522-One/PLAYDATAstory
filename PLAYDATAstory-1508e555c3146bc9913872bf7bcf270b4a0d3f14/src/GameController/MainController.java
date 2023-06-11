package GameController;

import java.util.Scanner;

public class MainController {


        public static void selectMenu(){
            Scanner sc = new Scanner(System.in);
                System.out.println("1. 게임시작 2. 게임 종료"); // 프린트 값 다시 설정하기
                String mode = sc.nextLine();
                switch (mode) {
                    case "1" :
                        new  CharacterController(sc).selectjob();
                    case "2":
                        break;
                }

        }

    }

