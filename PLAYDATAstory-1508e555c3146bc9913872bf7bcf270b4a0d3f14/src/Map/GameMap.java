package Map;

import java.util.Scanner;

public class GameMap {
    // public static Human human;

    Scanner sc = new Scanner(System.in);
    // field[][] .. 각 필드타입이
    static int[][] map = new int[3][4]; // 맵으로 사용 예정 4 X 5 짜리
    static int i, j = 0; // 위치데이터는 i,j가 갖고있다. // 캐릭터가 갖고있어야한다. 수정필요.
    String errSentence = "그곳으로 이동할 수 없습니다.";
    String clrSentence = "이미 클리어 하였습니다.";
    // try Exception 으로 움직임 예외처리.

    // 맵을 어떻게 보여줄 것이냐.
//    public Move(Human human) {
//        this.human = human;
//    }

    public void select() {
//        System.out.println(맵인쇄);
        System.out.println("1. 위 2. 아래 3. 오른쪽 4. 왼쪽");
        int selectDirection = Integer.parseInt(sc.nextLine());
        moveWhere(selectDirection);

    }

    private void moveWhere(int selectDirection) {
        //
        if ((1 <= selectDirection  )&& (selectDirection <= 4)) {
            changeDirection(selectDirection);
        } else {
            System.out.println("잘못된 입력입니다.");
            select();
        }
    }

    private void changeDirection(int Direction){
        try {
            situation(Direction);
            map[i][j] = 1; // clear

        } catch (Exception e) {
            System.out.println(errSentence);
            select();
        }
    }

//    System.out.println("잘못된 입력입니다.");
//    select();
    private void situation(int Direction){
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

    public int I() {
        return i;
    }

    public int J() {
        return j;
    }



}