package weapons;

import enemy.Enemy;

public class Staff extends Weapon {
    public Staff() {
        super("staff", 1);
    }

    @Override
    public void attack(Enemy enemy) {
        if (enemy.name.equals("knight")) {
            super.attack(enemy);
        }
    }
}
