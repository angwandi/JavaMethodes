package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePositon = calculateHighscorePosition(1500);
        displayHighScorePosition("Tim", highScorePositon);

        highScorePositon = calculateHighscorePosition(900);
        displayHighScorePosition("Bob", highScorePositon);

        highScorePositon = calculateHighscorePosition(400);
        displayHighScorePosition("Percy", highScorePositon);

        highScorePositon = calculateHighscorePosition(50);
        displayHighScorePosition("Gilbert", highScorePositon);

        highScorePositon = calculateHighscorePosition(1000);
        displayHighScorePosition("Louise", highScorePositon);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table ");
    }

    public static int calculateHighscorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}

