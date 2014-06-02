package game.logic;

/**
 * project_name:test
 * package_name:game.logic
 * user: Administrator
 * date: 14-4-9
 */
public class Person {
    public String name;

    Person(){}

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
