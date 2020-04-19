package ir.ac.kntu.gamelogic;

public class AssaultRifle extends Weapon{
    private static double attackRate=0.50;
    private static int damageRate=10;


    public AssaultRifle() {
        super();
    }

    public AssaultRifle(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public static double getAttackRate() {
        return attackRate;
    }

    public static int getDamageRate() {
        return damageRate;
    }
}
