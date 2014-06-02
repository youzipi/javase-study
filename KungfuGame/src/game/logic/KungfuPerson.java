package game.logic;

/**
 * project_name:test
 * package_name:game.logic
 * user: Administrator
 * date: 14-4-9
 */
public class KungfuPerson extends  Person{

    protected int blood = 1000;

    KungfuPerson(){}

    KungfuPerson(String name){
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void commonSkill(KungfuPerson p){
        p.blood -= 50;
    }

    public void bestSkill(KungfuPerson p){
        p.blood -= 100;
    }

}
