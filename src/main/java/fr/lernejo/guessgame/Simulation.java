package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    private boolean nextRound() {
        long number = player.askNextGuess();
        if (number == this.numberToGuess) {
            return true;
        } else {
            player.respond(number - this.numberToGuess > 0);
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        boolean running = false;
        while (!running) {
            running = nextRound();
        }
    }
}
