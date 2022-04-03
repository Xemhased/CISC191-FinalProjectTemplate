package edu.sdccd.cisc191.template;
// Adapted from module 3
import java.util.Random;

public class ModelBoard
{
    public static int DIMENSION = 4;
    public static int GUESSES = 16;
    public static int TOTAL_COINS = 8;

    private boolean[][] gameBoard;
    private int guessesRemaining;
    private int coinsRemaining;

    public ModelBoard()
    {
        gameBoard = new boolean[DIMENSION][DIMENSION];
        guessesRemaining = GUESSES;
        coinsRemaining = TOTAL_COINS;
        Random randomNumberGenerator = new Random();
        for (int coinCounter = 0; coinCounter < TOTAL_COINS; coinCounter++)
        {
            int x, y;

            do
            {
                x = randomNumberGenerator.nextInt(DIMENSION);
                y = randomNumberGenerator.nextInt(DIMENSION);
            } while (gameBoard[x][y]);
            gameBoard[x][y] = true;
        }
    }

    public boolean coinsAt(int row, int col)
    {
        return gameBoard[row][col];
    }

    public boolean makeGuess(int row, int col)
    {
        boolean foundCoin = coinsAt(row, col);
        guessesRemaining--;
        if (foundCoin)
        {
            coinsRemaining--;
        }

        return foundCoin;
    }

    public int getGuessesRemaining()
    {
        return guessesRemaining;
    }

    public int getCoinsRemaining()
    {
        return coinsRemaining;
    }
}

