
public class Manipulator extends Robot{
    private double tasima_kapasitesi;
    private double kol_uzunlugu;
    private double tasima_hizi;

    public Manipulator() {
        
    }

    public Manipulator(double tasima_kapasitesi, double kol_uzunlugu, double tasima_hizi, int motor_sayisi, double yuk_miktari) {
        super(motor_sayisi, yuk_miktari);
        this.tasima_kapasitesi = tasima_kapasitesi;
        this.kol_uzunlugu = kol_uzunlugu;
        this.tasima_hizi = tasima_hizi;
    }
    
    
    
    public double getTasima_kapasitesi() {
        return tasima_kapasitesi;
    }

    public void setTasima_kapasitesi(double tasima_kapasitesi) {
        this.tasima_kapasitesi = tasima_kapasitesi;
    }

    public double getKol_uzunlugu() {
        return kol_uzunlugu;
    }

    public void setKol_uzunlugu(double kol_uzunlugu) {
        this.kol_uzunlugu = kol_uzunlugu;
    }

    public double getTasima_hizi() {
        return tasima_hizi;
    }

    public void setTasima_hizi(double tasima_hizi) {
        this.tasima_hizi = tasima_hizi;
    }

  
    
}
