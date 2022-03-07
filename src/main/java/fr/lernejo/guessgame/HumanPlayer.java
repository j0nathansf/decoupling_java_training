package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final Logger logger = LoggerFactory.getLogger("human");

    @Override
    public long askNextGuess() {
        logger.log("Nombre :");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        sc.nextLine();
        logger.log("Vous avez choisi : " + number);
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        logger.log((lowerOrGreater) ? "Le nombre est plus petit" : "Le nombre est plus grand");
    }
}
