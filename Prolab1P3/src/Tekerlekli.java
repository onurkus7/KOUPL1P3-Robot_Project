
import java.util.Scanner;


public class Tekerlekli extends Gezgin{
    private int tekerlek_sayisi;
    private boolean engel_gecermi=true;
    Scanner klavye=new Scanner(System.in);

    public Tekerlekli( int motor_sayisi, double yuk_miktari, double gezinme_hizi,int tekerlek_sayisi) {
        super(motor_sayisi, yuk_miktari, gezinme_hizi);
        this.tekerlek_sayisi = tekerlek_sayisi;
    }

    public Tekerlekli() {
        
    }

    public int getTekerlek_sayisi() {
        return tekerlek_sayisi;
    }

    public void setTekerlek_sayisi(int tekerlek_sayisi) {
        this.tekerlek_sayisi = tekerlek_sayisi;
    }

    public boolean isEngel_gecermi() {
        return engel_gecermi;
    }

    @Override
    public void setGezinme_hizi(double gezinme_hizi) {
        while(!(gezinme_hizi>8)){
            System.out.println("Tekerlekli robotlarda gezinme hizi 8 m/s ve ustudur ");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
        
        super.setGezinme_hizi(gezinme_hizi); 
    }
    
    @Override
    public double EngelGecmeSuresiBul (){
    
    double saniye=(double)(this.getMotor_sayisi())*0.5;
    return saniye;
    }
   

   
    
    
}
