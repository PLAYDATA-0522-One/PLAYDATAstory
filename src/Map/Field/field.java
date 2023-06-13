package Map.Field;

import Global.Manager;
import Map.GameMap;
import building.Town;
import character.Human;
import character.Humaninfo;
import character.Monster;
import character.Position;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class field {

    Scanner sc = new Scanner(System.in);
    public static List<Monster> Monsters = new ArrayList<>();
    public static List<Humaninfo> Humaninfoes = new ArrayList<>();
    Town town = new Town(sc);
    int Type;

    int monsterHp;

    private int i;
    private int j;

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

    public boolean clearCheck(){
        return this.Clear;
    }
    public String isClear(){
        if(Clear){
            return "CLEAR";
        }else{
            return " ??? ";
        }
    }

    public void eventGeneration(){
        if( (0 <= Type) && (Type <= 5) || 9 == Type ){
            battleOn();
        } else if ( 6 <= Type && Type <= 8) {
            goToTown();
        }
    }

    public void battleOn() {
        i = new GameMap().I();
        j = new GameMap().J();
        System.out.println("적을 만났습니다. 전투를 시작합니다.");
        // 리스트 길이 가져와서 1/3 가량 int로 설정. 지금은 일단 3으로 직접 사용.
        if (i + j < 2) {
            Manager.monster = field.Monsters.get((int) (Math.random() * (field.Monsters.size() / 3)));
        } else if (2 <= i + j && i + j < 4) {
            Manager.monster =
                    field.Monsters
                            .get((int) field.Monsters.size() / 3
                                    + (int) (Math.random() * (field.Monsters.size() / 3)));
        } else if (i + j == 5) {
            System.out.println("보스입니다 조심하십시오.");
            Manager.monster = field.Monsters.get(field.Monsters.size() - 1);
        }

        battleFieldSelect();
    }

    public void battleFieldSelect(){


        System.out.println("적 이름은 " + Manager.monster.getName() + " 입니다.");

        System.out.println("내 HP " + Manager.human.getNowHp() + "       상대 HP " + Manager.monster.getNowHp() );
        System.out.println("내 공격력 " + Manager.human.getAttackpoint()
                + "     상대 공격력 "+Manager.monster.getAttackpoint());

        System.out.println("1. 공격하기 2. 방어하기. 3.도구사용(패치중)");

        String mode = sc.nextLine();
        battleField(mode);
    }

    public void battleField(String mode) {
        new Manager().monster.setPosition();
        //몬스터의 행동함수 실행 -> 포지션 정하기
        //몬스터는 70%확률로 공격 30%확률로 방어함.
        // now포지션 타입으로 enum 만들기
        // 포지션변경 함수 발동해서 각 타입에 맞게 포지션 설정해주기
        // 설정된포지션으로 if문 돌려서 공격과 방어
        // 방어 포지션인 경우, 그 순간만 실드를 얻음(새로운 아이디어)
        switch (mode) {
            case "1":

                if(Manager.monster.getPosition() == Position.DEFENCE){
                    System.out.println("상대방이 방어를 하고있습니다.");
                    System.out.println("데미지가 절감됩니다.");
                    System.out.print("상대방이 잘 막았습니다.");
                    System.out.println(Manager.monster.defenceDamage(Manager.human));
                    battleResult();

                }else if (Manager.monster.getPosition() == Position.ATTACK){
                    System.out.println("상대방도 공격을 하였습니다.");
                    System.out.print(Manager.monster.getName() + "가 ");
                    System.out.println(Manager.monster.getDamage(Manager.human));
                    if (Manager.monster.getNowHp() <= 0){
                        battleResult();
                        break;
                    }
                    System.out.print("유저는 ");
                    System.out.println(Manager.human.getDamage(Manager.monster));
                    if (Manager.human.getNowHp() <= 0){
                        battleResult();
                        break;
                    }
                    System.out.println(1);
                    battleResult();
                    break;

                }
                //공격 시퀀스;
                // 상대가 방어포지션인지 체크
                //
                break;
            case "2":
                if(Manager.monster.getPosition() == Position.DEFENCE){
                    System.out.println("상대방도 방어를 하였습니다.");
                    System.out.println("아무일도 일어나지 않았습니다.");
                    battleResult();
                    break;

                }else if(Manager.monster.getPosition() == Position.ATTACK){
                    System.out.println("상대방이 공격하였습니다.");
                    System.out.println("방어하였기에 데미지가 절감됩니다.");
                    System.out.println(Manager.human.defenceDamage(Manager.monster));
                    battleResult();
                    break;
                }
        }
    }

    private void battleResult() {
        if (Manager.monster.getNowHp() <= 0) {
            if (Type == 9) {
                System.out.println("클리어 하였습니다 축하합니다.");
                System.exit(0);
            }
            System.out.println("적을 무찔렀습니다.");
            Manager.monster.setNowHp(Manager.monster.getHp());
            this.Clear = true;
            return;
        } else if (Manager.human.getNowHp() <= 0) {
            System.out.println("피가 0이 되었습니다");
            System.out.println("gameover");
            System.exit(0);

        } else {
            battleFieldSelect();
        }
    }

    public void goToTown() {
        System.out.println("여기는 마을 입니다. 행동을 정해주세요.");
        System.out.println("1. 상점가기(패치중) 2. 회복하기 3. 나가기");
        String mode = sc.nextLine();
        townSituation(mode);
    }
    public void townSituation(String mode) {
        if(mode.equals("?")){
            town.enterShop();
        }
        else if(mode.equals("2")) {
            if(Manager.human.getHp() == Manager.human.getNowHp()){
                System.out.println("이미 최대 HP입니다");
                goToTown();
            }else {
                town.enterTemple();
            }
        }
        else if(mode.equals("3")) {
            System.out.println("마을을 벗어납니다.");
            this.Clear = true;
        }
        else{
            System.out.println("잘못된 선택입니다. 다시 골라주세요.");
            goToTown();
        }
    }
}