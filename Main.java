import java.util.Scanner;

import enemy.Enemy;
import enemy.Knight;
import enemy.Wizard;
import player.Player;

/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: October 16, 2026
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Turn Based RPG");
        System.out.println("--------------");
        System.out.println("[1] Play");
        System.out.println("[2] Quit");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "1":
                playGame(sc);
                break;
            case "2":
                break;
        }
    }

    public static void playGame(Scanner sc) {
        Player player = new Player("Steve");

        player.showWeapons();

        player.seeEnemy(new Knight());
        battle(player, sc);

        player.seeEnemy(new Knight());
        player.seeEnemy(new Wizard());
        player.seeEnemy(new Wizard());
        battle(player, sc);

        if (player.hp <= 0) {
            System.out.println("You lose...");
        } else {
            System.out.println("You win!!!");
        }
    }

    public static void battle(Player player, Scanner sc) {
        while (!player.visibleEnemies.isEmpty() && player.hp > 0) {
            player.playerTurn(sc);

            for (Enemy enemy : player.visibleEnemies) {
                enemy.enemyTurn(player, sc);
            }
        }
    }
}