package ir.ac.kntu;

import ir.ac.kntu.gamelogic.Methods;
import ir.ac.kntu.gamelogic.Solider;
import ir.ac.kntu.gamelogic.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Solider> redSolider=new ArrayList<>();
    public static ArrayList<Solider> orangeSolider=new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (true){
            Main.redSolider.clear();
            Main.orangeSolider.clear();
            System.out.println("To start a new game,press 1:");
            System.out.println("To exit the game,press 2:");
            int answer=scanner.nextInt();
            if (answer==1){
                System.out.println("Enter the forefront number:");
                int foreFront=scanner.nextInt();

                Methods.startAGame(foreFront);

            }else if (answer==2){
                break;
            }







        }



    }
}
