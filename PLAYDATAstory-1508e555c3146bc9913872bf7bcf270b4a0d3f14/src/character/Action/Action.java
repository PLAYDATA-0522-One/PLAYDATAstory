package character.Action;

import character.Human;

public class Action { //얘는 필드가 갖고있어야한다.
    private Human human;

    public Action(Human human) {
        this.human = human;
    }

    public void eventGeneration(int i, int j) { // 행동함수를 아예 밖으로 뺄까?

        if ((i == 3 && j == 1)) {
            마을();
        } else if (i == 4 && j == 5) {
            보스();
        } else {
            전투();
        }
    }

    public void 전투() {
    }
    public void 보스() {
    }
    public void 마을() {

    }
    public void 회복() {

    }
    public void 상점() {

    }

    public Human getHuman() {
        return human;
    }
}