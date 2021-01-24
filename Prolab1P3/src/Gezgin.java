
public class Gezgin extends Robot{
    private double gezinme_hizi;

    public Gezgin( int motor_sayisi, double yuk_miktari,double gezinme_hizi) {
        super(motor_sayisi, yuk_miktari);
        this.gezinme_hizi = gezinme_hizi;
    }

    public Gezgin() {
    }

    public double getGezinme_hizi() {
        return gezinme_hizi;
    }

    public void setGezinme_hizi(double gezinme_hizi) {
        this.gezinme_hizi = gezinme_hizi;
    }
    
    public double EngelGecmeSuresiBul (){
    
    
    return 0;
    }
   
    
    
    
    
    
}
