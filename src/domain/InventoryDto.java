package domain;

public class InventoryDto {

    private String weapon;
    private int gold;

    public InventoryDto(String weapon, int gold) {
        this.weapon = weapon;
        this.gold = gold;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}