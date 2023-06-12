package Service;

import character.Human;
import character.Jobclass;

public class Service {
    Human character;

    public void createdHuman(int mode){

        // 아이디비번직업입력();
        // 아이디 비번 직업 입력이 됨.
        // 서비스를 만들어서, 이 밑에있는 것들을 전부 넘기자.
        if(mode == 1){
            Human warrior = new Human(150,15, Jobclass.WARRIOR);
            character = warrior;
        } else if (mode == 2) {
            Human magician = new Human(75,30,Jobclass.MAGICIAN);
            character = magician;
        } else if (mode == 3) {
            Human theif = new Human(100,20,Jobclass.THIEF);
            character = theif;
        }
        // -> 내 아이디랑 비번, 캐릭터를 db로 보내기함수
    }
}
