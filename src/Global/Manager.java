package Global;

import Map.GameMap;
import character.Human;

public class Manager { //extends thread{
    public static Human human = null;
    public static GameMap map;

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
