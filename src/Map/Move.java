package Map;

import character.Action.Action;
import character.Human;

public class Move {
    public static Human human;
    private Action act = new Action();

    static int[][] map = new int[3][4]; // 맵으로 사용 예정 4 X 5 짜리
    static int i, j = 0; // 위치데이터는 i,j가 갖고있다.
    String errSentence = "그곳으로 이동할 수 없습니다.";
    String clrSentence = "이미 클리어 하였습니다.";
    // try Exception 으로 움직임 예외처리.

    // 맵을 어떻게 보여줄 것이냐.
    public Move(Human human) {
        this.human = human;
    }

    public static void select() {
        System.out.println(맵인쇄);
        System.out.println("1. 위 2. 아래 3. 오른쪽 4. 왼쪽");
        int selectDirection = Integer.parseInt(sc.nextLine());
        위치이동함수(selectDirection);

    }

    private void 위치이동함수(int selectDirection) {
        //
        if ((1 <= selectDirection  )&& (selectDirection <= 4)) {
            위치이동함수2(selectDirection);
        } else {
            System.out.println("잘못된 입력입니다.");
            select();
        }
    }

    private void 위치이동함수2(int k){
        try {
            상황판단함수(k);
            map[i][j] = 1;
            act.eventGeneration(i, j);
        } catch (Exception e) {
            System.out.println(errSentence);
            select();
        }
    }

//    System.out.println("잘못된 입력입니다.");
//    select();
    private void 상황판단함수(int Direction){
        if(Direction == 1){
            i = i - 1;
        }
        else if(Direction == 2){
            i = i +1;
        }
        else if(Direction == 3){
            j = j + 1;
        }
        else if(Direction == 4){
            j = j - 1;
        }

    }

    public static int[][] Map() {
        return map;
    }

    public static int I() {
        return i;
    }

    public static int J() {
        return j;
    }



}