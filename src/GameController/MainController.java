package GameController;

import java.util.Scanner;

public class MainController {


        public void selectMenu(){
            Scanner sc = new Scanner(System.in);
                System.out.println("1. 게임시작 2. 게임 종료");
                String mode = sc.nextLine();
                while (true) {
                    switch (mode) {
                        case "1":
                            new CharacterController(sc).selectjob();
                        case "2":
                            break;
                    }
                }

        }

    }

