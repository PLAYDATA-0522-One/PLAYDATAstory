//package field;
//
//import character.Monster;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Cartel {
//    static Scanner sc = new Scanner(System.in);
//    static List<Monster> monsters=new ArrayList<>();
//    static String[] monster_Name = {"a","aa","aaa","aaaa","aaaaa"};
//    static int [] monster_Attackpoint = {1,2,3,4,5};
//    static int [] monster_Hp = {10,20,30,40,50};
//    static int [] monster_Sheid = {1,2,3,4,5};
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            String name = monster_Name[i];
//            int attackpoint =monster_Attackpoint[i];
//            int hp =monster_Hp[i];
//            int sheid = monster_Sheid[i];
//            Monster monster = new Monster(name,hp,attackpoint,sheid);
//            monsters.add(monster);
//        }
//    }
//}
