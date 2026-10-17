package enemy;

import java.util.Scanner;

import player.Player;

public class Wizard extends Enemy {
    public Wizard() {
        super("wizard", 1, 2);
    }

    @Override
    public void enemyTurn(Player player, Scanner sc) {
        super.enemyTurn(player, sc, '*', 9);
    }
}
