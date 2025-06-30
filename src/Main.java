package Basics;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("                                  WELCOME !!                  ");
        System.out.println("                 To the Console based ROCK, PAPER, SCISSORS game                 ");
        Scanner xy = new Scanner(System.in);
        Random xyz = new Random();
        System.out.print("Enter your Name : ");
        String name = xy.nextLine();
        System.out.println("Welcome there!! "+ name);
        System.out.println("Lets Begin!! ");
        String[] option = {"Rock", "Paper", "Scissor"};
        String playAgain = " ";
        do {
            System.out.println("Enter your move (ROCK, PAPER, SCISSOR)");
            String userMove = xy.next();
            if(!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissor")) {
                System.out.println("INVALID CHOICE MADE !! Please enter the valid option (ROCK, PAPER,SCISSOR)");
                continue;
            }
            int index = xyz.nextInt(3);
            String machineMove = option[index];
            System.out.println("Machine move : "+ machineMove);
            // deciding the winner of the game
            if(userMove.equals(machineMove)){
                System.out.println("GG!! It's a Tie Game");
            }
            else if(userMove.equalsIgnoreCase("Rock") && machineMove.equalsIgnoreCase("Scissor") || userMove.equalsIgnoreCase("Scissor") && machineMove.equalsIgnoreCase("Paper") || userMove.equalsIgnoreCase("Paper") && machineMove.equalsIgnoreCase("Rock") ){
                System.out.println("CONGRATS!! YOU won :)");
            }
            else {
                System.out.println("NICE TRY !! Machine Wins ");
            }
            System.out.println("Do you want to play more (Yes/No) : ");
            playAgain=xy.next();
        }while (playAgain.equalsIgnoreCase("Yes"));

        System.out.println("THANKS !! That was a great time :) ");
        xy.close();
    }
}