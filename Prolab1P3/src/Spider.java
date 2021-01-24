
import java.util.Scanner;


public class Spider extends Gezgin{
    private int bacak_sayisi;
    private boolean engel_gecermi=false; 
Scanner klavye=new Scanner(System.in);
    public Spider( int motor_sayisi, double yuk_miktari, double gezinme_hizi,int bacak_sayisi) {
        super(motor_sayisi, yuk_miktari, gezinme_hizi);
        this.bacak_sayisi = bacak_sayisi;
    }

    public Spider() {
        
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    public boolean isEngel_gecermi() {
        return engel_gecermi;
    }

    @Override
    public void setGezinme_hizi(double gezinme_hizi) {
         while(!(gezinme_hizi<4 && gezinme_hizi>0)){
            System.out.println("Spider robotlarda gezinme hizi 0  ile 4 m/s arasindadir");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
        super.setGezinme_hizi(gezinme_hizi); 
    }

 
    
    
    
}
