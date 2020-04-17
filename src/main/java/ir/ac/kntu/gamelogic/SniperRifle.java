package ir.ac.kntu.gamelogic;
import java.util.Random;

public class SniperRifle extends Weapon{
    private static double attackRate=0.60;
    private static int damageRate=20;
    private boolean zoomInEnabled;
    private Bullet bullet;

    public SniperRifle() {
    }
    public void attackAndDamageHandle(boolean zoomInEnabled,Bullet bullet){
        if (zoomInEnabled){
            if (Bullet.BULLET_5.equals(bullet)){

            }
            else{

            }
        }
        else {
        }
    }

    public SniperRifle(boolean zoomInEnabled, Bullet bullet) {
        this.zoomInEnabled = zoomInEnabled;
        this.bullet = bullet;
    }
    public double getAttackRate() {
        Random random=new Random();
        double rand;
        if (this.zoomInEnabled==true&&Bullet.BULLET_5.equals(bullet)){
            rand=(random.nextInt(11)+5)%100;
            return attackRate+rand+0.15;
        }
        else if (this.zoomInEnabled==true&&Bullet.BULLET_7.equals(bullet)){
            rand=(random.nextInt(11)+5)%100;
            return attackRate-0.1+rand;
        }
        else if (this.zoomInEnabled==false&&Bullet.BULLET_5.equals(bullet)){
            return attackRate+0.15;
        }
        else if (this.zoomInEnabled==false&&Bullet.BULLET_7.equals(bullet)){
            return attackRate-0.1;
        }
        return 0;
    }
    public int getDamageRate() {
        if (Bullet.BULLET_7.equals(bullet)){
            return damageRate+10;
        }
        return damageRate;
    }
    public boolean isZoomInEnabled() {
        return zoomInEnabled;
    }
    public void setZoomInEnabled(boolean zoomInEnabled) {
        this.zoomInEnabled = zoomInEnabled;
    }
    public Bullet getBullet() {
        return bullet;
    }
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
