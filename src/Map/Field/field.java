package Map.Field;

import Global.Manager;
import Map.GameMap;
import building.Town;
import character.Human;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class field {

    Scanner sc = new Scanner(System.in);
    Town town = new Town(sc);
    int Type;

    //몬스터 테이블 만들어야함.
    boolean Clear = false;
//스캐너 밖에서 끌어와야함.!
    public field() {
        this.Type =(int) (Math.random()*9);
    } // 0<math < 9

    public field(int Final){
        this.Type = Final;
    }
    public field(String string){
        Clear = true;
    }

    public String isClear(){
        if(Clear){
            return "CLEAR";
        }else{
            return "???";
        }
    }

    public void eventGeneration(){
        if( (0 <= Type) && (Type <= 5)  ){
            battleOn();
        } else if ( 6 <= Type && Type <= 8) {
            goToTown();
        } else if(9 == Type){
            finalBoss();
        }
    }

    public void battleOn() {
        int i = new GameMap().I();
        int j = new GameMap().J();
        System.out.println("적을 만났습니다. 전투를 시작합니다.");

        if(i + j < 2){
   //     몬스터 클래스 =   배열에서get 해오기 (Math.random()*((int) 몬스터 클래스 배열 길이/3))
        }else if( 2<= i + j < 4)
        ; //
        //몬스터 클래스에 적 넣기
        battleFieldSelect();
    } //보스랑 적이랑 하나로 합칠 순 있음.

    public void finalBoss() {
        System.out.println("보스를 만났습니다. 전투를 시작합니다.");
        //몬스터 클래스에 보스 넣기
        battleFieldSelect();
        System.out.println("보스");
    }

    public void battleFieldSelect(){

        System.out.println("내 HP" + Manager.human.getHp() + "상대 HP" );
        System.out.println("공격력");
        System.out.println("1. 공격하기 2. 방어하기. 3.도구사용(패치중)");

        String mode = sc.nextLine();
        battleField(mode);
    }

    public void battleField(String mode) {
        //몬스터의 행동함수 실행 -> 포지션 정하기
        //몬스터는 70%확률로 공격 30%확률로 방어함.
        // now포지션 타입으로 enum 만들기
        // 포지션변경 함수 발동해서 각 타입에 맞게 포지션 설정해주기
        // 설정된포지션으로 if문 돌려서 공격과 방어
        // 방어 포지션인 경우, 그 순간만 실드를 얻음(새로운 아이디어)
        switch (mode) {
            case "1":
                //공격 시퀀스;
                // 상대가 방어포지션인지 체크
                //
                break;
            case "2":
                // 방어 시퀀스;
                // 내가 방어 포지션.
                // 상대방이 공격포지션이었다면 공격. 아니었다면 둘다 방어.
                break;
            default:

                if(상대피가 0 인지 체크){
                    if(상대가 보스였는지 체크 ( 나의 위치체크)){
                    System.out.println("클리어 하였습니다 축하합니다.");
                        }
                }
                break;
        }
                else if (내피가 0 인지 체크){
            System.out.println("gameover");
               //여기서 자바 완전 종료?
            }else{
            (battleFieldSelect());
            }

        }

    public void goToTown() {
        System.out.println("여기는 마을 입니다. 행동을 정해주세요.");
        System.out.println("1. 상점가기(패치중) 2. 회복하기");
        int mode = Integer.parseInt(sc.nextLine());
        townSituation(mode);
    }
    public void townSituation(int mode) {
    if(mode == 1){
        town.enterShop();
    }
    else if(mode == 2){
        town.enterTemple();
    }else{
        System.out.println("잘못된 선택입니다. 다시 골라주세요.");
        goToTown();
    }
    }
}
