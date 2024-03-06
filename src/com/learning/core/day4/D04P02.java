package com.learning.core.day4;
import java.util.Scanner;

public class D04P02 {
	static class NotEligibleException extends Exception {
        public NotEligibleException(String message) {
            super(message);
        }
    }

    static class CricketRating {
        private String playerName;
        private float critic1;
        private float critic2;
        private float critic3;
        private float avgRating;
        private String coins;

        public CricketRating(String playerName, float critic1, float critic2, float critic3) {
            this.playerName = playerName;
            this.critic1 = critic1;
            this.critic2 = critic2;
            this.critic3 = critic3;
            calculateAverageRating(critic1, critic2, critic3);
            calculateCoins();
        }

        public void calculateAverageRating(float critic1, float critic2) {
            avgRating = (critic1 + critic2) / 2;
        }

        public void calculateAverageRating(float critic1, float critic2, float critic3) {
            avgRating = (critic1 + critic2 + critic3) / 3;
        }

        public String calculatedCoins() throws NotEligibleException {
            if (avgRating >= 7) {
                return "gold";
            } else if (avgRating >= 5 && avgRating < 7) {
                return "silver";
            } else if (avgRating >= 2 && avgRating < 5) {
                return "copper";
            } else {
                throw new NotEligibleException("NotEligible");
            }
        }

        public void display() {
            System.out.println(playerName + " " + avgRating + " " + coins);
        }

        private void calculateCoins() {
            try {
                coins = calculatedCoins();
            } catch (NotEligibleException e) {
                System.out.println("Player " + playerName + " is not eligible for coins.");
            }
        }
    }

    static class Tester {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter player name:");
            String playerName = scanner.nextLine();

            System.out.println("Enter critic 1 rating:");
            float critic1 = scanner.nextFloat();

            System.out.println("Enter critic 2 rating:");
            float critic2 = scanner.nextFloat();

            System.out.println("Enter critic 3 rating:");
            float critic3 = scanner.nextFloat();

            CricketRating rating = new CricketRating(playerName, critic1, critic2, critic3);
            rating.display();

            scanner.close();
        }
    }

    public static void main(String[] args) {
        // You can directly call Tester.main() here if you want to execute the Tester class.
        Tester.main(args);
    }
}