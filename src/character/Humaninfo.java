package character;

public class Humaninfo{

    int id;
    String job;
    String name;
    int hp;
    int attackpoint;

    public Humaninfo(int id, String job, String name, int hp, int attackpoint) {
        this.id = id;
        this.job = job;
        this.name = name;
        this.hp = hp;
        this.attackpoint = attackpoint;
    }


    //    public void setStatus(Human human){
//        this.setHp(human.getHp());
//        this.setAttackpoint(human.getAttackpoint());
//
//    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}