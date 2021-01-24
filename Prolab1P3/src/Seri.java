
import java.util.Scanner;


public class Seri extends Manipulator{
Scanner klavye = new Scanner(System.in);
    public Seri() {
    }

    public Seri(double tasima_kapasitesi, double kol_uzunlugu, double tasima_hizi, int motor_sayisi, int yuk_miktari) {
        super(tasima_kapasitesi, kol_uzunlugu, tasima_hizi, motor_sayisi, yuk_miktari);
    }

    @Override
    public void setTasima_hizi(double tasima_hizi) {
        while(!(tasima_hizi<4 && tasima_hizi>0)){
            
            System.out.println("Seri robotlarin tasima hizi 0 ile 4 m/s arasindadir  (Paralel robotlardan dusuk deger alamaz)!");
            System.out.print("Tekrar giriniz = ");
            tasima_hizi=klavye.nextDouble();
        }
        
        super.setTasima_hizi(tasima_hizi); 
    }

    @Override
    public double getTasima_hizi() {
        return super.getTasima_hizi(); 
    }

    @Override
    public void setKol_uzunlugu(double kol_uzunlugu) {
        super.setKol_uzunlugu(kol_uzunlugu); 
    }

    @Override
    public double getKol_uzunlugu() {
        return super.getKol_uzunlugu(); 
    }

    @Override
    public void setTasima_kapasitesi(double tasima_kapasitesi) {
        while(!(tasima_kapasitesi<13 && tasima_kapasitesi >0)){
            System.out.println("Seri robotlarin tasima kapasitesi 0 ile 13 kg arasindadir");
            System.out.print("Tekrar gir = ");
            tasima_kapasitesi=klavye.nextDouble();
        }
        
        super.setTasima_kapasitesi(tasima_kapasitesi); 
    }

    @Override
    public double getTasima_kapasitesi() {
        return super.getTasima_kapasitesi(); 
    }

    @Override
    public void setYuk_miktari(double yuk_miktari) {
        while(this.getTasima_kapasitesi()<yuk_miktari){
            System.out.println("Yuk miktari tasima kapasitesinden buyuk.Lutfen "+this.getTasima_kapasitesi()+" kg den daha az bir deger gir = ");
            yuk_miktari=klavye.nextDouble();
            
        }
        
        super.setYuk_miktari(yuk_miktari); 
    }

    @Override
    public double getYuk_miktari() {
        return super.getYuk_miktari(); 
    }
    
    
    
}
