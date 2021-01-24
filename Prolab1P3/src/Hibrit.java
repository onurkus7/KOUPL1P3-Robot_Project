
import java.util.Scanner;


public class Hibrit extends Gezgin implements IManipulator{
Scanner klavye =new Scanner(System.in);
    
    private double sabitlenme_suresi;
    
    private String gezgin_ismi;

    private String manipulator_ismi;

    private int tekerlek_sayisi;
    private int palet_sayisi;
    private int bacak_sayisi;
    private double tasima_kapasitesi;
    private double kol_uzunlugu;
    private double tasima_hizi;
    private double gecis_suresi;
    private boolean engel_gecermi;
    
    public Hibrit(int motor_sayisi, double yuk_miktari, double gezinme_hizi) {
        super(motor_sayisi, yuk_miktari, gezinme_hizi);
    }

    public Hibrit() {
    }

    public boolean isEngel_gecermi() {
        if(gezgin_ismi.equalsIgnoreCase("spider")){
            return false;
        }
        
        
        return true;
    }

    

    
    
    public double getGecis_suresi() {
        return gecis_suresi;
    }

    public void setGecis_suresi(double gecis_suresi) {
        this.gecis_suresi = gecis_suresi;
    }

    
    
    public double getSabitlenme_suresi() {
        return sabitlenme_suresi;
    }

    public void setSabitlenme_suresi(double sabitlenme_suresi) {
        
        this.sabitlenme_suresi = sabitlenme_suresi;
    }

    public String getGezgin_ismi() {
        return gezgin_ismi;
    }

    public void setGezgin_ismi(String gezgin_ismi) {
        this.gezgin_ismi = gezgin_ismi;
    }

    public String getManipulator_ismi() {
        return manipulator_ismi;
    }

    public void setManipulator_ismi(String manipulator_ismi) {
        this.manipulator_ismi = manipulator_ismi;
    }

    public int getTekerlek_sayisi() {
        return tekerlek_sayisi;
    }

    public void setTekerlek_sayisi(int tekerlek_sayisi) {
        this.tekerlek_sayisi = tekerlek_sayisi;
    }

    public int getPalet_sayisi() {
        return palet_sayisi;
    }

    public void setPalet_sayisi(int palet_sayisi) {
        this.palet_sayisi = palet_sayisi;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    //gezgin override
    
    @Override
    public void setGezinme_hizi(double gezinme_hizi) {
        if(gezgin_ismi.equalsIgnoreCase("tekerlekli")){
            while(!(gezinme_hizi>8)){
            System.out.println("Tekerlekli robotlarda gezinme hizi 8 m/s ve ustudur ");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
            
        }
        else if(gezgin_ismi.equalsIgnoreCase("paletli")){
            while(!(gezinme_hizi<8 && gezinme_hizi>4)){
            System.out.println("Paletli robotlarda gezinme hizi 4 m/s ile 8 m/s arasindadir");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
            
        }
        else if(gezgin_ismi.equalsIgnoreCase("spider")){
             while(!(gezinme_hizi<4 && gezinme_hizi>0)){
            System.out.println("Spider robotlarda gezinme hizi 0  ile 4 m/s arasindadir");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
        }
        super.setGezinme_hizi(gezinme_hizi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGezinme_hizi() {
        return super.getGezinme_hizi(); //To change body of generated methods, choose Tools | Templates.
    }

    
    //robot override
    
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

    @Override
    public void setMotor_sayisi(int motor_sayisi) {
        super.setMotor_sayisi(motor_sayisi); 
    }

    @Override
    public int getMotor_sayisi() {
        return super.getMotor_sayisi(); 
    }
            
    
    
    
    
    
    //manipulator override
    
    @Override
    public double getTasima_kapasitesi() {
        return tasima_kapasitesi;
    }

    @Override
    public void setTasima_kapasitesi(double tasima_kapasitesi) {
        if(manipulator_ismi.equalsIgnoreCase("Seri")){
            while(!(tasima_kapasitesi<13 && tasima_kapasitesi >0)){
            System.out.println("Seri robotlarin tasima kapasitesi 0 ile 13 kg arasindadir");
            System.out.print("Tekrar gir = ");
            tasima_kapasitesi=klavye.nextDouble();
            }
        }
        else if(manipulator_ismi.equalsIgnoreCase("paralel")){
            while( !(tasima_kapasitesi >13)){
            System.out.println("Paralel robotlarin tasima kapasitesi 13 kg ustudur (Seri robotlardan dusuk deger alamaz)! ");
            System.out.print("Tekrar gir = ");
            tasima_kapasitesi=klavye.nextDouble();
        }
            
        }
        this.tasima_kapasitesi=tasima_kapasitesi;
    }

    @Override
    public double getKol_uzunlugu() {
         return kol_uzunlugu;
    }

    @Override
    public void setKol_uzunlugu(double kol_uzunlugu) {
        this.kol_uzunlugu = kol_uzunlugu;
    }

    @Override
    public double getTasima_hizi() {
        return tasima_hizi;
    }

    @Override
    public void setTasima_hizi(double tasima_hizi) {
        if(manipulator_ismi.equalsIgnoreCase("seri")){
           while(!(tasima_hizi<4 && tasima_hizi>0)){
            
            System.out.println("Seri robotlarin tasima hizi 0 ile 4 m/s arasindadir  (Paralel robotlardan dusuk deger alamaz)!");
            System.out.print("Tekrar giriniz = ");
            tasima_hizi=klavye.nextDouble();
        
           } 
        
        }
        else if (manipulator_ismi.equalsIgnoreCase("paralel")){
            while( !(tasima_kapasitesi >13)){
            System.out.println("Paralel robotlarin tasima kapasitesi 13 kg ustudur (Seri robotlardan dusuk deger alamaz)! ");
            System.out.print("Tekrar gir = ");
            tasima_kapasitesi=klavye.nextDouble();
        }
        
        }
        this.tasima_hizi = tasima_hizi;
    }

    @Override
    public double EngelGecmeSuresiBul() {
        if(gezgin_ismi.equalsIgnoreCase("tekerlekli")){
            double saniye=(double)(this.getMotor_sayisi())*0.5;
    return saniye;
            
        }
        else if(gezgin_ismi.equalsIgnoreCase("paletli")){
            double saniye=(double)(this.getMotor_sayisi())*(double)3;
            return saniye;
            
        }
        
          return 0;   
        
        
        
    }
    
}
