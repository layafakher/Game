package ir.ac.kntu;

import ir.ac.kntu.gamelogic.Methods;
import ir.ac.kntu.gamelogic.Solider;
import ir.ac.kntu.gamelogic.Team;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("To start a new game,press 1:");
            System.out.println("To exit the game,press 2:");
            int answer=scanner.nextInt();
            if (answer==1){
                System.out.println("Enter the forefront number:");
                int forefront=scanner.nextInt();
                Solider []redSolider=new Solider[forefront];
                Solider []orangeSolider=new Solider[forefront];

                int i;
                for (i=0;i<forefront;i++){
                    Solider solider=new Solider();
                    redSolider[i]=solider;
                    redSolider[i].setNumber(i+1);
                    redSolider[i].setTeam(Team.RED_TEAM);
                }
                for (i=0;i<forefront;i++){
                    Solider solider=new Solider();
                    orangeSolider[i]=solider;
                    orangeSolider[i].setNumber(i+1);
                    orangeSolider[i].setTeam(Team.ORANGE_TEAM);
                }
                Methods.startGame(redSolider,orangeSolider,forefront);

            }else if (answer==2){
                break;
            }







        }



    }
}
