package character.Action;

public class Action {

    public void eventGeneration(int i,int j) { // 행동함수를 아예 밖으로 뺄까?

        if ((i == 3 && j == 1)) {
            상점();
        } else if (i == 4 && j == 5) {
            보스();
        } else {
            전투();
        }
    }

    public void 전투() {
    }
    public void 상점() {

    }
    public void 회복() {

    }
}