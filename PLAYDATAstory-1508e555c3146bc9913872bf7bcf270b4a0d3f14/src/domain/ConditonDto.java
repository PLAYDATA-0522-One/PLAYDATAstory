package domain;

public class ConditonDto {


    private int x;
    private int y;
    private String map_name;

    public ConditonDto(int x, int y, String map_name) {
        this.x = x;
        this.y = y;
        this.map_name = map_name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getMap_name() {
        return map_name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMap_name(String map_name) {
        this.map_name = map_name;
    }
}
