import mainui.MainUi;
import character.Human;
import character.Jobclass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Human> BOX= new ArrayList<>();
    public static void main(String[] args) {
        MainUi mainUi = new MainUi();
        mainUi.selectMenu(sc); //-> 게임 시작 / 게임 종료  // 게임 시작 -> Static bit on : Gamestart

        while(MainUi.isFineGameStart()){
            if(Human.isCreated){
                //필드 함수(클래스);
                // 뉴 클래스 = 필드.클래스 반환 골라라();
                // 클래스속에서 다른애로 가는데
                // 클래스 = 전투()
                // retrun = 클래스
                // 기존 클래스.바꾸기(뉴 클래스)
                BOX.get(0);
                //필드 함수(ch);
            }else{
                makeHuman();
            }
        }
        // while(Gamestart:true){if(캐릭터가 만들어지지 않았으면 B() //else(캐릭터가 만들어졌을 때) C();
        //
    }
    public static void makeHuman(){
        System.out.println("1.캐릭터 생성 2. 캐릭터 불러오기 3. 되돌리기");
        int mode = Integer.parseInt(sc.nextLine());
        selectjob(mode);
    }
    public static void selectjob(int mode){

        if (mode == 1) {
            System.out.println("1.전사 2.마법사 3.도적");
            int mode2 = Integer.parseInt(sc.nextLine());
            createdHuman(mode2);
        }
        else if(mode==2){
            // 캐릭터 불러오기 쪽
        }

        else{
            MainUi mainUi = new MainUi();
            mainUi.selectMenu(sc);

        }
    }
    public static void createdHuman(int mode){
        if(mode == 1){
            Human warrior = new Human(150,30, Jobclass.WARRIOR);
            BOX.add(warrior);
            Human.setCreated();
        } else if (mode ==2) {
            Human magician = new Human(100,10,Jobclass.MAGICIAN);
            BOX.add(magician);
            Human.setCreated();
        }
        else if (mode ==3){
            Human thief =new Human(90,35,Jobclass.THIEF);
            BOX.add(thief);
            Human.setCreated();
        }
        else {
            makeHuman();
        }
    }
}

