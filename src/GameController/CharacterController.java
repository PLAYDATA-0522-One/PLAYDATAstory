package GameController;

import Global.Manager;
import Map.GameMap;
import domain.SignupDto;
import repository.UserRepository;
import service.UserService;

import java.util.Scanner;

public class CharacterController {
    static GameMap map = new GameMap(); // 얘가 sc를 받아서 맵을 만들어야함.

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
            //게임을 여기서 해야함
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
        boolean check = service.login(id,pw); //-> 이게 로그인이 되었다는 신호
        // 여기서 맵을 만들 예정.
        new Manager().saveHp(); // 첫 시작 hp 저장. 이걸 클래스 만들때 같이 처리해도될듯.

        while (check){
            map.select();

        }
        // 프로그램의 끝단.
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