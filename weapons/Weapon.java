package weapons;
public abstract class Weapon {
    public String name;
    public int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.damage + " Damage";
    }

    public void attack(enemy.Enemy enemy) {
        enemy.hp -= this.damage;
    }
}
