package enemy;

import java.util.Random;
import java.util.Scanner;

import player.Player;

public abstract class Enemy {
    public String name;
    public int damage;
    public int hp;

    public Enemy(String name, int damage, int hp) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.hp + " HP, " + this.damage + " Damage, ";
    }

    public void enemyTurn(Player player, Scanner sc, char operation, int max) {
        if (player.hp <= 0) return;

        System.out.println("--- " + this.name + "'s Turn (" + this.hp + " HP) ---");

        Random rand = new Random();

        int first = rand.nextInt(max);
        int second = rand.nextInt(max);

        System.out.println(this.name + " asks: What is " + first + " " + operation + " " + second + "?");
        System.out.print("> ");

        int answer = sc.nextInt();
        int correctAnswer;

        switch (operation) {
            case '-':
                correctAnswer = first - second;
                break;
            case '*':
                correctAnswer = first * second;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        if (answer == correctAnswer) {
            System.out.println("Correct! " + this.name + " is confused and does not attack!");
        } else {
            player.hp -= this.damage;

            System.out.println("Wrong! The answer was " + correctAnswer + ".");
            System.out.println(this.name + " attacks " + player.name + " for " + this.damage + " damage!");
            System.out.println(player.name + " has " + player.hp + " HP left!");
        }

        System.out.println();
    }

    public abstract void enemyTurn(Player player, Scanner sc);
}
