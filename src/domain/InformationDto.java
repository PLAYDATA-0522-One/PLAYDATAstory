package domain;

public class InformationDto {


    private int hp;
    private int attackpoint;
    private int id;
    private String name;
    private String job;

    public InformationDto(int hp, int attackpoint, int id, String name, String job) {
        this.hp = hp;
        this.attackpoint = attackpoint;
        this.id = id;
        this.name = name;
        this.job = job;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackpoint() {
        return attackpoint;
    }

    public void setAttackpoint(int attackpoint) {
        this.attackpoint = attackpoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}