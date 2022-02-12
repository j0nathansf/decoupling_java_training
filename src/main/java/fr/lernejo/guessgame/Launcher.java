package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        Simulation s = new Simulation(new HumanPlayer());
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        s.initialize(randomNumber);
        s.loopUntilPlayerSucceed();
    }
}
