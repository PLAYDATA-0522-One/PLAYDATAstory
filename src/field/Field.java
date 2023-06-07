package field;

import character.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class Field {
    Human human = new Human();
    Scanner sc = new Scanner(System.in);
    static int[][] map = new int[3][4]; // 맵으로 사용 예정 4 X 5 짜리
    static int i, j = 0;
    String errSentence = "그곳으로 이동할 수 없습니다";
    // try Exception 으로 움직임 예외처리.

    // 맵을 어떻게 보여줄 것이냐.
    public Field(Human human) {
        this.human = human;
    }

    public void select() {
        System.out.println(맵인쇄);
        System.out.println("1. 위 2. 아래 3. 오른쪽 4. 왼쪽");
        int mode = Integer.parseInt(sc.nextLine());
        위치이동함수(mode);
    }

    public void 위치이동함수(int mode) {
        //
        if (mode == 1) {
            try {
                i = i - 1;
                map[i][j] += 1;
                함수();
            } catch (Exception e) {
                System.out.println(errSentence);
                select();
            }

        } else if (mode == 2) {
            if (mode == 1) {
                try {
                    map[i][j + 1] = 1;
                    상점();
                } catch (Exception e) {
                    System.out.println(errSentence);
                }
            } else if (mode == 3) {
                회복();
            } else
        }

        public void 전투 () {
        }
        public void 상점 () {

        }
        public void 회복 () {

        }
    }

    private void 함수() {

        if ((i == 3 && j == 1)) {
            상점();
        } else if (i == 4 && j == 5) {
            보스();
        } else {
            전투();
        }
    }
}