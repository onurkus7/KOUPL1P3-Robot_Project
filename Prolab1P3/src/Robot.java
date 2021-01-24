
public class Robot {
    private int motor_sayisi;
    private double yuk_miktari;

    public Robot(){
        
    }
    
    
    public Robot(int motor_sayisi, double yuk_miktari) {
        this.motor_sayisi = motor_sayisi;
        this.yuk_miktari = yuk_miktari;
    }

    public int getMotor_sayisi() {
        return motor_sayisi;
    }

    public void setMotor_sayisi(int motor_sayisi) {
        this.motor_sayisi = motor_sayisi;
    }

    public double getYuk_miktari() {
        return yuk_miktari;
    }

    public void setYuk_miktari(double yuk_miktari) {
        this.yuk_miktari = yuk_miktari;
    }
    
    
}
