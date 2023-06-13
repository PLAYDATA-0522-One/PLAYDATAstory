package GameController;

import Global.Manager;
import Map.GameMap;
import domain.SignupDto;
import repository.MonsterRepository;
import repository.UserInfoRepository;
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
        String mode = sc.nextLine();
        if (mode.equals("1")) {
            login(sc);
            //게임을 여기서 해야함
        } else if (mode.equals("2")) {
            signup(sc);
        } else {
            System.out.println("잘못입력했습니다. 다시 입력해주세요.");
            selectjob();

        }
    }

    private static void login (Scanner sc){

        System.out.println("아이디 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();
        boolean check = service.login(id,pw); //-> 이게 로그인이 되었다는 신호
        // -> 여기에서 클래스 제작.
        // 여기서 맵을 만들 예정.
        new Manager().saveHp();


        if(check)
        {
            map.makeMap();
            new MonsterRepository().inputAllmonster();
        }// 첫 시작 hp 저장. 이걸 클래스 만들때 같이 처리해도될듯.

        while (check){
            map.select();
        }
        // 프로그램의 끝단.
    }

    private static void signup (Scanner sc){
        System.out.println("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 : ");
        String pw = sc.nextLine();
        chooseJob(sc, id, pw);
    }

    private static void chooseJob(Scanner sc, String id, String pw) {
        System.out.println("직업은 전사, 도적, 마법사 중에 선택하시오");
        System.out.println("직업을 입력하세요 : ");
        String job = sc.nextLine();

        if(job.equals("전사") ||job.equals("도적") ||job.equals("마법사")) {
            SignupDto dto = new SignupDto(id, pw, job);
            service.signup(dto);
        } else {
            System.out.println("잘못입력하셨습니다");
            chooseJob(sc, id, pw);

        }
    }


}