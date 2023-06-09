import GameController.MainController;
import GameController.CharacterController;

public class Main {
    static MainController mainController = MainController.getInstance();
    public static void main(String[] args) {
        while(true) {
            if (!CharacterController.isCreated) {
                mainController.게임시작및캐릭터생성();
            } else if (CharacterController.isCreated) {
             //   field.행동함수();
            }
        }


        // while(Gamestart:true){if(캐릭터가 만들어지지 않았으면 B() //else(캐릭터가 만들어졌을 때) C();
        //


    }
}

