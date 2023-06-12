package GameController;

import Global.Manager;
import Map.GameMap;
import domain.SignupDto;
import service.UserService;

import java.util.Scanner;

public class CharacterController {
    private static UserService service = UserService.getInstance();

    private static Scanner sc;

    private static GameMap map = new GameMap();

    public CharacterController(Scanner sc) {
        this.sc = sc;
    }

    public static void selectjob() {
        System.out.println("1. 로그인, 2. 회원가입, 3.돌아가기");
        int mode = Integer.parseInt(sc.nextLine());
        if (mode == 1) {
            login(sc);
            //계속 while로 일 계속함
        } else if (mode == 2) {
            signup(sc);
            //계정 생성후 테이블에 넣어줌
        }
        else if (mode ==3){
            MainController.selectMenu();
        }
        else {
            System.out.println("다시 입력 부탁 드립니다.");
            selectjob();
        }

    }

        private static void login (Scanner sc){
            System.out.println("insert id : ");
            String id = sc.nextLine();
            System.out.println("insert pw : ");
            String pw = sc.nextLine();
            boolean check = service.login(id,pw);
            new Manager().saveHp();
            if(check)
            {
                map.makeMap();
            }
            while(check){
                map.select();

            };
            //CharacterController.selectjob();
        }

        private static void signup (Scanner sc){
            System.out.println("insert id : ");
            String id = sc.nextLine();
            System.out.println("insert pw : ");
            String pw = sc.nextLine();
            System.out.println("직업은 전사, 도적, 마법사 중에 선택하시오");
            System.out.println("insert job : ");
            String job = sc.nextLine();
            SignupDto dto = new SignupDto(id, pw, job);
            service.signup(dto);
            CharacterController.selectjob();
        }
}
