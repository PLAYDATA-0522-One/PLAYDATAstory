import MainUi.MainUi;
import character.Human;
import character.Jobclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    List<Human> BOX= new ArrayList<>();
    public static void main(String[] args) {
        MainUi mainUi = new MainUi();
        mainUi.selectMenu(sc); //-> 게임 시작 / 게임 종료  // 게임 시작 -> Static bit on : Gamestart

        while(MainUi.isFineGameStart()){
            if(Human.isCreated){
                //필드 필드 = new 필드(클래스);
                //필드(

            }else{
                makeHuman();
            }
        }
        // while(Gamestart:true){if(캐릭터가 만들어지지 않았으면 B() //else(캐릭터가 만들어졌을 때) C();
        //
    }

    public static void makeHuman(){
        System.out.println("1.캐릭터 생성 2. 캐릭터 불러오기 3. 되돌아가기");
        int mode = Integer.parseInt(sc.nextLine());
        selectjob(mode);



    }
    public static void selectjob(int mode){

        if (mode == 1) {
            System.out.println("1.전사 2.마법사 3.도적");
            int mode2 = Integer.parseInt(sc.nextLine());
            createdHuman(mode2);
        }else if(mode == 2){
            //여기에 캐릭터 불러오기 관해 자료 읽기 시작.
            //불러올 데이터를 보여주기
        }
        else{ makeHuman();
        }

    }
    public static void createdHuman(int mode){
        if(mode == 1){
            Human warrior = new Human(150,30, Jobclass.WARRIOR);
            BOX.add(warrior);
        } else if (mode ==2) {
          //  Human magician = new Human()

        }
    }
}

