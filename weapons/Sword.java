package weapons;

import enemy.Enemy;

public class Sword extends Weapon {
    public Sword() {
        super("sword", 1);
    }

    @Override
    public void attack(Enemy enemy) {
        if (enemy.name.equals("wizard")) {
            super.attack(enemy);
        }
    }
}
