package enemy;

import java.util.Scanner;

import player.Player;

public class Knight extends Enemy {
    public Knight() {
        super("knight", 1, 4);
    }

    @Override
    public void enemyTurn(Player player, Scanner sc) {
        super.enemyTurn(player, sc, '-', 100);
    }
}
