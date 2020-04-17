package ir.ac.kntu.gamelogic;

import java.util.Random;

public class Solider {
    private int number;
    private int life=100;
    private Weapon weapon;
    private Team team;
    private boolean isAlive=true;


    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Solider() {
        setWeapon();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLife() {
        return life;
    }
    public  void setLife(int life) {
        this.life = life;
    }
    public void setWeapon(){
        Random random=new Random();
        SniperRifle sniperRifle=new SniperRifle();
        AssaultRifle assaultRifle=new AssaultRifle();
        int n=random.nextInt(2)+1;
        if (n==1){
            this.weapon=sniperRifle;
        }else if (n==2){
            this.weapon=assaultRifle;
        }
    }
    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public String toString() {
        return "Solider{" +
                " team=" + team +
                ", number=" + number +
                ", weapon=" + weapon +
                '}';
    }
}
