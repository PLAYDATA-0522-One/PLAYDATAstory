package Map;

import Map.Field.field;

import java.util.Scanner;

public class GameMap {
    // public static Human human;

    Scanner sc = new Scanner(System.in);
    static field[][] stage = new field[3][4]; //.. 각 필드타입이
    static String[][] map = new String[3][4];
    //static int[][] map = new int[3][4]; // 맵으로 사용 예정 4 X 5 짜리
    static int i, j = 0; // 위치데이터는 i,j가 갖고있다. // 캐릭터가 갖고있어야한다. 수정필요.
    String errSentence = "그곳으로 이동할 수 없습니다.";
    String clrSentence = "이미 클리어 하였습니다.";
    // try Exception 으로 움직임 예외처리.

    // 맵을 어떻게 보여줄 것이냐.
//    public Move(Human human) {
//        this.human = human;
//    }

    public static void makeMap(){
        for (int i = 0; i < stage.length ; i++) {
            for (int j = 0; j < stage[i].length; j++) {

                if((i == stage.length) && j == (stage[stage.length].length)) {
                    stage[i][j] = new field(9); //보스
                }
                else if(i ==0 && j == 0){
                    stage[i][j] = new field("Start"); //
                }else {
                    stage[i][j] = new field();
                }
            }

        }
    }

    public void select() {
        System.out.println( );
        System.out.println("1. 위 2. 아래 3. 오른쪽 4. 왼쪽");
        try {
            int selectDirection = Integer.parseInt(sc.nextLine());
            moveWhere(selectDirection);
        }catch (Exception e){
            System.out.println("잘못된 입력입니다.");
        }
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
        int tempI = i;
        int tempJ = j;

        try {
            situation(Direction);
            stage[i][j].eventGeneration();

            // -> 여기에서 정보 업데이트
        } catch (Exception e) {
            System.out.println(errSentence);
            i = tempI;
            j = tempJ;
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
    //
//    public static int[][] Map() {
//        return map;
//    }
//
    public int I() {
        return i;
    }

    public int J() {
        return j;
    }
}