package GuesserGame;

import java.util.Scanner;

class Guesser {
    int guesserNumber;
    
    public int guesserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser guess a number: ");
        guesserNumber = sc.nextInt();

        return guesserNumber;
    }
}

class Player {
    int playerNumber;
    
    public int playerNumber() {
        Scanner sc = new Scanner(System.in);
        playerNumber = sc.nextInt();

        return playerNumber;
    }
}

class Umpire {
    private int guesserNumber;
    private int playerNumber1;
    private int playerNumber2;
    private int playerNumber3;

    public void collectNumberFromGuesser() {
        Guesser g = new Guesser();
        guesserNumber = g.guesserNumber();
    }

    public void collectNumberFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        System.out.print("Player 1 guess a number: ");
        playerNumber1 = p1.playerNumber();
        System.out.print("Player 2 guess a number: ");
        playerNumber2 = p2.playerNumber();
        System.out.print("Player 3 guess a number: ");
        playerNumber3 = p3.playerNumber();
    }

    public void compare() {
        if(guesserNumber == playerNumber1) {
            if(guesserNumber == playerNumber2 && guesserNumber==playerNumber3) {
                System.out.println("All player won the game.");
            }
            else if(guesserNumber == playerNumber2) {
                System.out.println("Player 1 & Player 2 won the game.");
            }
            else if(guesserNumber == playerNumber3) {
                System.out.println("Player 1 & Player 3 won the game.");
            }
            else {
                System.out.println("Only Player 1 won the game.");
            }
        }
        else if(guesserNumber == playerNumber2) {
            if(guesserNumber == playerNumber3) {
                System.out.println("Player 2 & Player 3 won the game.");
            }
            else {
                System.out.println("Only Player 2 won the game.");
            }
        }
        else if(guesserNumber == playerNumber3) {
            System.out.println("Only Player 3 won the game.");
        }
        else {
            System.out.println("All player lost the game.");
        }
    }
}

public class MyGuesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();

        System.out.println("----Game Started----");
        u.collectNumberFromGuesser();
        u.collectNumberFromPlayers();
        u.compare();
        System.out.println("----Game Over----");
    }
}