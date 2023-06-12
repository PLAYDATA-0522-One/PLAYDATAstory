package Global;

import Map.GameMap;
import character.Human;
import character.Humaninfo;
import character.Monster;

public class Manager { //extends thread{
    public static Human human = null;
    public static GameMap map;
    public static Monster monster;
    public static Humaninfo humaninfo;
    // history
    private static int fullHp;

    public void saveHp() {
        if (human != null) {
            fullHp = human.getHp();
        }
    }
    public int getFullHp() {
        return fullHp;
    }
}
