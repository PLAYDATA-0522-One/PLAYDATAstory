import GameMenu.MainUi;
import GameMenu.MakeCharacter;
import character.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Human> BOX = new ArrayList<>();
    static MainUi mainUi = MainUi.getInstance();
    public static void main(String[] args) {
        while(true) {
            if (!MakeCharacter.isCreated) {
                mainUi.게임시작및캐릭터생성();
            } else if (MakeCharacter.isCreated) {
                field.행동함수();
            }
        }


        // while(Gamestart:true){if(캐릭터가 만들어지지 않았으면 B() //else(캐릭터가 만들어졌을 때) C();
        //


    }
}

