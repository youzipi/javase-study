package game.logic;

/**
 * project_name:test
 * package_name:game.logic
 * user: Administrator
 * date: 14-4-9
 */
public class KungfuMaster extends KungfuPerson implements secretSkill {

    @Override
    public void secrets(KungfuPerson p) {
        p.blood -= 300;
    }
}
