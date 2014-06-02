package game.roles;

import game.logic.KungfuMaster;
import game.logic.KungfuPerson;

/**
 * project_name:test
 * package_name:game.roles
 * user: Administrator
 * date: 14-4-9
 */
public class Ouyangfeng extends KungfuMaster {

    public Ouyangfeng() {
    }
    public Ouyangfeng(String name){
        this.name = name;
    }

    @Override
    public void secrets(KungfuPerson p) {
        super.secrets(p);
        System.out.println(this.getName() + "使用绝学蛤蟆功攻击" + p.getName() + "300点血！");

    }

    @Override
    public void commonSkill(KungfuPerson p) {
        super.commonSkill(p);
        System.out.println(this.getName() + "使用毒蛇攻击" + p.getName() + "50点血！");

    }

    @Override
    public void bestSkill(KungfuPerson p) {
        super.bestSkill(p);
        System.out.println(this.getName() + "使用毒蛇拐杖攻击" + p.getName() + "100点血！");

    }
}
