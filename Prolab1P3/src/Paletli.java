import java.util.Scanner;
public class Paletli extends Gezgin {
     private int palet_sayisi;
     private boolean engel_gecermi=true;
Scanner klavye=new Scanner(System.in);
    
     public Paletli() {
       
    }
     
     public Paletli( int motor_sayisi, double yuk_miktari, double gezinme_hizi,int palet_sayisi) {
        super(motor_sayisi, yuk_miktari, gezinme_hizi);
        this.palet_sayisi = palet_sayisi;
    }

    public int getPalet_sayisi() {
        return palet_sayisi;
    }

    public void setPalet_sayisi(int palet_sayisi) {
        this.palet_sayisi = palet_sayisi;
    }

    public boolean isEngel_gecermi() {
        return engel_gecermi;
    }

    @Override
    public void setGezinme_hizi(double gezinme_hizi) {
        while(!(gezinme_hizi<8 && gezinme_hizi>4)){
            System.out.println("Paletli robotlarda gezinme hizi 4 m/s ile 8 m/s arasindadir");
            System.out.print("Tekrar giriniz = ");
            
            gezinme_hizi=klavye.nextDouble();
        }
        
        
        super.setGezinme_hizi(gezinme_hizi); 
    }

    
    
    
    
    
    
     @Override
    public double EngelGecmeSuresiBul (){
    
    double saniye=(double)(this.getMotor_sayisi())*(double)3;
    return saniye;
    }
   

    
     
     
}
