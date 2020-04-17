package ir.ac.kntu.gamelogic;

import java.util.Random;

public class Methods {
    public static void startGame(Solider []redSolider,Solider []orangeSolider,int foreFront){
        System.out.println("Game has started!");
        Random random=new Random();
        int redNumber=random.nextInt(foreFront)+foreFront+1;
        int orangeNumber=random.nextInt(foreFront)+1;
        System.out.println("Fight between :");
        redSolider[redNumber].toString();
        orangeSolider[orangeNumber].toString();

    }
    public static void startRound(Solider []redSolider,Solider []orangeSolider){



    }
}
