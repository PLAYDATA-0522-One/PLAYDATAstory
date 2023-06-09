package GameController;

import domain.SignupDto;
import service.UserService;

import java.util.Scanner;

public class CharacterController {
    private static UserService service = UserService.getInstance();

    private Scanner sc;

    public CharacterController(Scanner sc) {
        this.sc = sc;
    }

    public void selectjob() {
        System.out.println("1. 로그인, 2. 회원가입, 3.돌아가기");
        int mode = Integer.parseInt(sc.nextLine());
        if (mode == 1) {
            login(sc);
        } else if (mode == 2) {
            signup(sc);
        } else {

        }
    }

        private static void login (Scanner sc){
            System.out.println("insert id : ");
            String id = sc.nextLine();
            System.out.println("insert pw : ");
            String pw = sc.nextLine();
            service.login(id,pw);

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
        }


}
