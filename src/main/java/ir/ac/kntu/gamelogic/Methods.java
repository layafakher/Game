package ir.ac.kntu.gamelogic;

import ir.ac.kntu.Main;

import java.util.Random;

public class Methods {
    public static void startAGame(int foreFront) {
        int i;
        for (i=0;i<foreFront;i++){
            Solider solider=new Solider();
            solider.setNumber(i+1);
            solider.setTeam(Team.RED_TEAM);
            Main.redSolider.add(solider);
        }
        for (i=0;i<foreFront;i++){
            Solider solider=new Solider();
            solider.setNumber(i+1);
            solider.setTeam(Team.ORANGE_TEAM);
            Main.orangeSolider.add(solider);

        }
        System.out.println("Game has started!");
        Random random = new Random();
        int redNumber = RandomHelper.nextInt(foreFront-1);
        int orangeNumber = RandomHelper.nextInt(foreFront-1);
        System.out.println("Fight between :");
        System.out.println(Main.orangeSolider.get(orangeNumber).toString());
        System.out.println(Main.redSolider.get(redNumber).toString());
        while (true){






        }


    }

    public static void startRound(Solider[] redSolider, Solider[] orangeSolider) {
    }

    public void method() {
    }
}
