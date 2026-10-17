package player;
import java.util.ArrayList;
import java.util.Scanner;

import enemy.Enemy;
import weapons.Staff;
import weapons.Sword;
import weapons.Weapon;

public class Player {
    public String name;

    public int hp = 3;
    public ArrayList<Weapon> weapons = new ArrayList<>();
    public ArrayList<Enemy> visibleEnemies = new ArrayList<>();

    public Player(String name) {
        this.name = name;

        this.weapons.add(new Sword());
        this.weapons.add(new Staff());
    }

    public void showWeapons() {
        System.out.println(this.name + "'s Weapons:");

        for (Weapon weapon : this.weapons) {
            System.out.println("  " + weapon);
        }

        System.out.println();
    }

    public void seeEnemy(Enemy enemy) {
        if (this.hp <= 0) return;

        this.visibleEnemies.add(enemy);
        System.out.println(this.name + " sees the " + enemy.name + "!");
        System.out.println("  " + enemy);
        System.out.println();
    }

    public void playerTurn(Scanner sc) {
        System.out.println("--- " + this.name + "'s Turn (" + this.hp + " HP) ---");
        System.out.println("What do you do?");

        for (int i = 0; i < this.visibleEnemies.size(); i++) {
            Enemy enemy = this.visibleEnemies.get(i);

            System.out.println("  [" + i + "] Attack " + enemy);
        }

        System.out.print("  > ");
        int enemyInput = sc.nextInt();

        System.out.println("With which weapon?");

        for (int i = 0; i < this.weapons.size(); i++) {
            Weapon weapon = this.weapons.get(i);

            System.out.println("  [" + i + "] " + weapon);
        }

        System.out.print("  > ");
        int weaponInput = sc.nextInt();

        Enemy enemy = this.visibleEnemies.get(enemyInput);
        Weapon weapon = this.weapons.get(weaponInput);

        weapon.attack(enemy);

        System.out.println(this.name + " attacks the " + enemy.name + " with the " + weapon.name + "!");
        System.out.println("  " + enemy);
        System.out.println();

        if (enemy.hp <= 0) {
            System.out.println(this.name + " defeated the " + enemy.name + "!");
            System.out.println();
            this.visibleEnemies.remove(enemy);
        }
    }
}