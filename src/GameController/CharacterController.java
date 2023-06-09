package GameController;

import character.Human;
import character.Jobclass;

import java.util.Scanner;

public class CharacterController {

    public static Human character;
    public static boolean isCreated = false; // 캐릭터가 null 이냐 아니냐만 판단해도 boolean 판단 가능
    Scanner sc = new Scanner(System.in);


    public void makeHuman(){
        System.out.println("1.캐릭터 생성 2. 캐릭터 불러오기 3. 되돌아가기");
        int mode = Integer.parseInt(sc.nextLine());
        selectjob(mode);

    }
    private void selectjob(int mode){

        if (mode == 1) {
            System.out.println("1.전사 2.마법사 3.도적");
            int mode2 = Integer.parseInt(sc.nextLine());
            createdHuman(mode2);
        }else if(mode == 2){
            //여기에 캐릭터 불러오기 관해 자료 읽기 시작.
            //불러올 데이터를 보여주기
        }
        else{ makeHuman();}

    }
    private void createdHuman(int mode){
        if(mode == 1){
            Human warrior = new Human(150,15, Jobclass.WARRIOR);
            character = warrior;
        } else if (mode ==2) {
            Human magician = new Human(75,30,Jobclass.MAGICIAN);
            character = magician;
        } else if (mode == 3) {
            Human theif = new Human(100,20,Jobclass.THIEF);
            character = theif;
        }
    }

    public Human getCharacter() {
        return character;
    }

}
