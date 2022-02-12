package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final Logger logger = LoggerFactory.getLogger("player");
    private Scanner sc = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.println("Nombre :");
        long number = this.sc.nextLong();
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        logger.log((lowerOrGreater) ? "Le nombre est plus petit" : "Le nombre est plus grand");
    }
}
