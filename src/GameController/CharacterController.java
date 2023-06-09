package GameController;

import Global.Manager;
import Service.Service;
import character.Human;
import character.Jobclass;

import java.util.Scanner;

public class CharacterController {

    public Human character;
    Scanner sc = new Scanner(System.in);


    public void makeHuman(){
        System.out.println("1.캐릭터 생성 2. 캐릭터 불러오기 3. 되돌아가기");
        int mode = Integer.parseInt(sc.nextLine());
        selectjob(mode);

    }
    private void selectjob(int mode){
        // -> 여기서 아이디 비번 만들고
        if (mode == 1) {
            System.out.println("1.전사 2.마법사 3.도적");
            int mode2 = Integer.parseInt(sc.nextLine());
            //아이디 비번 직업 입력(); -이 테이블이랑 // 초기에 아이디 비번 직업.
            new Service().createdHuman(mode2);

        }else if(mode == 2){
            // 아이디 비번 을 입력해서 내 계정 가져오기 - 얘랑 달라야함.

            //여기에 캐릭터 불러오기 관해 자료 읽기 시작.
            //불러올 데이터를 보여주기
        }
        else{ makeHuman();}

    }


    public Human getCharacter() {
        return character;
    }

}
