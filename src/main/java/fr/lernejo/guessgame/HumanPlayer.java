package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        System.out.println("Nombre :");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        logger.log((lowerOrGreater) ? "Le nombre est plus petit" : "Le nombre est plus grand");
    }
}
