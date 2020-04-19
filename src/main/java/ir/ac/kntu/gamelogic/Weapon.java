package ir.ac.kntu.gamelogic;

public class Weapon {
    public Bullet bullet;

    public Weapon() {
        setBullet();
    }

    public void setBullet() {
        if (RandomHelper.nextBoolean())
        this.bullet =Bullet.BULLET_5;
        else {
            this.bullet=Bullet.BULLET_7;
        }
    }

    @Override
    public String toString() {
        return ", Weapon="
                + this.getClass().getSimpleName()+this.bullet
                ;
    }
}
