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
        for (i=0;i<=foreFront*2;i++){
        int redNumber,orangeNumber;
        redNumber=createRandomSolider1(foreFront);
        orangeNumber=createRandomSolider2(foreFront);
        if (redNumber!=-1 && orangeNumber!=-1){
        System.out.println("Game has started!");
        System.out.println("Fight between :");
        System.out.println(Main.orangeSolider.get(orangeNumber).toString());
        System.out.println(Main.redSolider.get(redNumber).toString());
        int round=0;
        if (fight(round,redNumber,orangeNumber)){
            continue;
        }
        }else {
            System.out.println("start a new Game!");
            break;
        }}
    }
    public static int createRandomSolider1(int foreFront){
        int redNumber;
        Solider []soliders=new Solider[2000];
                Main.redSolider.toArray(soliders);
                int i;
        for (i=0;i<soliders.length;i++){
            if (soliders[i].isAlive()){
                break;
            }else {
                if (i==soliders.length-1){
                    return -1;
                }else {
                    continue;
                }

            }
        }
            redNumber=RandomHelper.nextInt(foreFront-1);
        return redNumber;
    }
    public static int createRandomSolider2(int foreFront){
        int orangeNumber;
        Solider []soliders=new Solider[2000];
        Main.orangeSolider.toArray(soliders);
        int i;
        for (i=0;i<soliders.length;i++){
            if (soliders[i].isAlive()){
                break;
            }else {
                if (i==soliders.length-1){
                    return -1;
                }else {
                    continue;
                }
            }
        }
        orangeNumber=RandomHelper.nextInt(foreFront-1);
        return orangeNumber;
    }

    public static void startRound(Solider orangeSolider, Solider redSolider,int round) {
        System.out.println("**************Round "+round+"**************");
        System.out.println("red Solider"+redSolider.getNumber()+" Start shooting!");
        System.out.println("orange Solider"+orangeSolider.getNumber()+" Start shooting!");
        if (RandomHelper.nextDouble()>redSolider.getWeapon().getAttackRate()){
            orangeSolider.setLife(orangeSolider.getLife()-redSolider.getWeapon().getDamageRate());
            System.out.println("red Solider"+redSolider.getNumber()+" shoot orange Solider "+orangeSolider.getNumber());

        }else {
            System.out.println("orange Solider"+orangeSolider.getNumber()+"  was not hurt!");
        }
        if (RandomHelper.nextDouble()>orangeSolider.getWeapon().getAttackRate()){
            redSolider.setLife(redSolider.getLife()-orangeSolider.getWeapon().getDamageRate());
            System.out.println("orange solider"+orangeSolider.getNumber()+"shoot red Solider "+redSolider.getNumber());
        }else {
            System.out.println("red Solider"+redSolider.getNumber()+"  was not hurt!");
        }
        if (redSolider.getLife()>0 && orangeSolider.getLife()>0){
        System.out.println("red Solider"+redSolider.getNumber()+" new life : "+redSolider.getLife());
        System.out.println("orange Solider"+orangeSolider.getNumber()+" new life : "+orangeSolider.getLife());
        }
        else {
            if (redSolider.getLife()<=0){
                System.out.println("red Solider"+redSolider.getNumber()+" died!");
                redSolider.setAlive(false);
            }
            if (orangeSolider.getLife()<=0){
                System.out.println("orange Solider"+orangeSolider.getNumber()+" died!");
                orangeSolider.setAlive(false);
            }
            System.out.println("/////////Game Over!\\\\\\\\\\\\\\");

        }
    }
    public static boolean fight(int round,int redNumber,int orangeNumber){
        boolean condition=false;
        while (true){
            round++;
            startRound(Main.orangeSolider.get(orangeNumber),Main.redSolider.get(redNumber),round);
            if (Main.redSolider.get(redNumber).getLife()<=0||Main.orangeSolider.get(orangeNumber).getLife()<=0)
            {   condition=true;
                break;
            }
            else {
                continue;
            }
        }
        return condition;
    }
}



