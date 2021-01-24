
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;


public class AnaEkran extends JFrame {

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
   
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner (System.in);
        ArrayList <String> robot_turleri = new ArrayList ( );
        int robot_sayisi;
        System.out.println("-------Robot Turleri------\n1-Tekerlekli\n2-Paletli\n3-Spider\n4-Seri\n5-Paralel\n6-Hibrit");
        System.out.print("Tanimlanacak robot sayisi = ");
        robot_sayisi=klavye.nextInt();
        klavye.nextLine();
         for (int i = 0; i < robot_sayisi; i++) {
            System.out.print((i+1)+". Tanimlanacak robot tipi =  ");
            String isim=klavye.nextLine();
            robot_turleri.add(isim);
        }
         
         Tekerlekli tekerlekli=new Tekerlekli();
         Paletli paletli = new Paletli();
         Spider spider = new Spider();
         Seri seri =new Seri();
         Paralel paralel=new Paralel();
         Hibrit hibrit =new Hibrit();
        //robotun bilgileri ve ozellikleri bu kod satirinda alinir
        for (int i = 0; i < robot_turleri.size(); i++) {
            if(robot_turleri.get(i).equalsIgnoreCase("Tekerlekli")){
                System.out.println((i+1)+". Robot -----Tekerlekli robot turu bilgilerin girilmesi-----");
                
                
                
                System.out.print("Motor sayisi = ");
                tekerlekli.setMotor_sayisi(klavye.nextInt());
                System.out.print("Yuk miktari = ");
                tekerlekli.setYuk_miktari(klavye.nextDouble());
                System.out.print("Gezinme hizi = ");
                tekerlekli.setGezinme_hizi(klavye.nextDouble());
                System.out.print("Tekerlek sayisi = ");
                tekerlekli.setTekerlek_sayisi(klavye.nextInt());
                klavye.nextLine();
                
            }
            else if(robot_turleri.get(i).equalsIgnoreCase("Paletli")){
                System.out.println((i+1)+". Robot -----Paletli robot turu bilgilerin girilmesi-----");
                
                
                System.out.print("Motor sayisi = ");
                paletli.setMotor_sayisi(klavye.nextInt());
                System.out.print("Yuk miktari = ");
                paletli.setYuk_miktari(klavye.nextDouble());
                System.out.print("Gezinme hizi = ");
                paletli.setGezinme_hizi(klavye.nextDouble());
                System.out.print("Palet sayisi = ");
                paletli.setPalet_sayisi(klavye.nextInt());
                klavye.nextLine();
                
            }
             else if(robot_turleri.get(i).equalsIgnoreCase("Spider")){
                System.out.println((i+1)+". Robot -----Spider robot turu bilgilerin girilmesi-----");
                
               
                System.out.print("Motor sayisi = ");
                spider.setMotor_sayisi(klavye.nextInt());
                System.out.print("Yuk miktari = ");
                spider.setYuk_miktari(klavye.nextDouble());
                System.out.print("Gezinme hizi = ");
                spider.setGezinme_hizi(klavye.nextDouble());
                System.out.print("Bacak sayisi = ");
                spider.setBacak_sayisi(klavye.nextInt());
                klavye.nextLine();
            }
             /*gezmeyen robotlarin konumu sabittir
             tasima hizi seri robotlar cok yavas paralel cok hizlidir kontrol yapilmali
             yuk kapasitesi tasima kapasitesi seri robotlar az  paralel daha agir kaldirabilir
             */
             else if(robot_turleri.get(i).equalsIgnoreCase("Seri")){
                System.out.println((i+1)+". Robot -----Seri robot turu bilgilerin girilmesi-----");
                
                System.out.print("Motor sayisi = ");
                seri.setMotor_sayisi(klavye.nextInt());
                System.out.print("Tasima kapasitesi = ");
                seri.setTasima_kapasitesi(klavye.nextDouble());
                System.out.print("Yuk miktari = ");
                seri.setYuk_miktari(klavye.nextDouble());
                
                
                System.out.print("Tasima hizi = ");
                seri.setTasima_hizi(klavye.nextDouble());
                
                System.out.print("Kol uzunlugu = ");
                seri.setKol_uzunlugu(klavye.nextDouble());
                klavye.nextLine();
                
            }
             else if(robot_turleri.get(i).equalsIgnoreCase("Paralel")){
                System.out.println((i+1)+". Robot -----Paralel robot turu bilgilerin girilmesi-----");
                
                
                
                
                System.out.print("Motor sayisi = ");
                paralel.setMotor_sayisi(klavye.nextInt());
               System.out.print("Tasima kapasitesi = ");
                paralel.setTasima_kapasitesi(klavye.nextDouble());
                System.out.print("Yuk miktari = ");
                paralel.setYuk_miktari(klavye.nextDouble());
                System.out.print("Tasima hizi = ");
                paralel.setTasima_hizi(klavye.nextDouble());
                System.out.print("Kol uzunlugu = ");
            paralel.setKol_uzunlugu(klavye.nextDouble());
            klavye.nextLine();
             
            }
            else if(robot_turleri.get(i).equalsIgnoreCase("Hibrit")){
                System.out.println((i+1)+". Robot -----Hibrit robot turu bilgilerin girilmesi-----");
                
                
               
                
                System.out.print("Sabitlenme suresi = ");
                hibrit.setSabitlenme_suresi(klavye.nextDouble());
                System.out.print("(Yuku robotun uzerinden alip, robot koluna gecirmek icin gecis suresi) Gecis suresi = ");
                hibrit.setGecis_suresi(klavye.nextDouble());
                klavye.nextLine();
                System.out.print("Hibrit robot için Gezgin kismi = ");
                hibrit.setGezgin_ismi(klavye.nextLine());
                System.out.print("Hibrit robot için Manipulator kismi = ");
                hibrit.setManipulator_ismi(klavye.nextLine());
                
                if(hibrit.getGezgin_ismi().equalsIgnoreCase("Tekerlekli")){
                    
                    System.out.print("Motor sayisi = ");
                    hibrit.setMotor_sayisi(klavye.nextInt());
                    System.out.print("Gezinme hizi = ");
                hibrit.setGezinme_hizi(klavye.nextDouble());
                
                    System.out.print("Tekerlek sayisi = ");
                    hibrit.setTekerlek_sayisi(klavye.nextInt());
                    klavye.nextLine();
                }
                if(hibrit.getGezgin_ismi().equalsIgnoreCase("Spider")){
                    System.out.print("Motor sayisi = ");
                     hibrit.setMotor_sayisi(klavye.nextInt());
                    System.out.print("Gezinme hizi = ");
                 hibrit.setGezinme_hizi(klavye.nextDouble());
                
                    System.out.print("Bacak sayisi = ");
                    hibrit.setBacak_sayisi(klavye.nextInt());
                    klavye.nextLine();
                }
                 if(hibrit.getGezgin_ismi().equalsIgnoreCase("Paletli")){
                    System.out.print("Motor sayisi = ");
                     hibrit.setMotor_sayisi(klavye.nextInt());
                     System.out.print("Gezinme hizi = ");
                hibrit.setGezinme_hizi(klavye.nextDouble());
                
                    System.out.print("Palet sayisi = ");
                     hibrit.setPalet_sayisi(klavye.nextInt());
                     klavye.nextLine();
                }
                
                if(hibrit.getManipulator_ismi().equalsIgnoreCase("Seri")){
                    
                    System.out.print("Tasima kapasitesi = ");
                    hibrit.setTasima_kapasitesi(klavye.nextDouble());
                    System.out.print("Yuk miktari = ");
                hibrit.setYuk_miktari(klavye.nextDouble());
                
                    System.out.print("Tasima hizi = ");
                hibrit.setTasima_hizi(klavye.nextDouble());
                
                    System.out.print("Kol uzunlugu = ");
                    hibrit.setKol_uzunlugu(klavye.nextDouble());
                    klavye.nextLine();
                }
                
                
                if(hibrit.getManipulator_ismi().equalsIgnoreCase("Paralel")){
                    
                    System.out.print("Tasima kapasitesi = ");
                hibrit.setTasima_kapasitesi(klavye.nextDouble());
                    System.out.print("Yuk miktari = ");
                hibrit.setYuk_miktari(klavye.nextDouble());
                
                    System.out.print("Tasima hizi = ");
                hibrit.setTasima_hizi(klavye.nextDouble());
                
                    System.out.print("Kol uzunlugu = ");
                    hibrit.setKol_uzunlugu(klavye.nextDouble());
                klavye.nextLine();
                }
                
                
                
                
            }
            
            
        }
        //engel ekleme
        
        System.out.println("Engel girecek misiniz (Evet Hayir)");
        String EvetHayir=klavye.nextLine();
        int engel_sayisi=0;
        int[][] engel_koordinat=new int[400][2];
        if(EvetHayir.equalsIgnoreCase("Evet")){
            System.out.print("Girilecek engel sayisi = ");
            engel_sayisi=klavye.nextInt();
            for (int i = 0; i < engel_sayisi; i++) {
                System.out.print((i+1)+". engelin x = ");
                engel_koordinat[i][0]=klavye.nextInt();
                System.out.print((i+1)+". engelin y = ");
                engel_koordinat[i][1]=klavye.nextInt();
                
            }
        }
        
        
         
        
        //ekran acma
        
        //Robot robot=new Robot(80,80);
        AnaEkran ekran = new AnaEkran("Mr Robot");
        GrafikKullanimi grafik = new GrafikKullanimi(engel_koordinat,engel_sayisi);
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(900,800);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.add(grafik);
        
       
        /*System.out.println("30 birim hareket icin 30a basin");
        int sayi=klavye.nextInt();
        grafik.x=30;
        grafik.repaint();*/
        
        //hareket islemleri
        
        while(true){
            
            System.out.print("Hangi siradaki robot hareket ettirilicek = ");
            
            int sira=klavye.nextInt();
            klavye.nextLine();
            
            if(robot_turleri.get(sira-1).equalsIgnoreCase("Tekerlekli")){
                System.out.println("tekerlekli islemleri");
                double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                     grafik.x2=grafik.x;
                                        grafik.y2=grafik.y;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/tekerlekli.getGezinme_hizi())+gecen_sure;
                                    
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(tekerlekli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+tekerlekli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                    
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                               
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    robotx=robotx-1;
                                    
                                    gecen_sure=((double)10/tekerlekli.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                      if(tekerlekli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+tekerlekli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/tekerlekli.getGezinme_hizi())+gecen_sure;
                                    
                                    
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(tekerlekli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+tekerlekli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                System.out.println("ileri gidildi "+adim+" kere");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                           for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/tekerlekli.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            
                                   if(tekerlekli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+tekerlekli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        
                        }
                    
                    
                    
                    }
            
             
            
            }
            
            else if(robot_turleri.get(sira-1).equalsIgnoreCase("Paletli")){
                System.out.println("paletli islemleri");
                 double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/paletli.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(paletli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+paletli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                    
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                               
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                    robotx=robotx-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/paletli.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                      if(paletli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+paletli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                System.out.println("sol gidildi "+adim+" kere");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/paletli.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(paletli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+paletli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                           for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/paletli.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            
                                   if(paletli.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+paletli.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        
                        }
                    
                    
                    
                    }
            
            }
             
            else if(robot_turleri.get(sira-1).equalsIgnoreCase("Spider")){
                System.out.println("spider islemleri");
                
                 double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/spider.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                    robotx=robotx-1;
                                    gecen_sure=((double)10/spider.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/spider.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                    gecen_sure=((double)10/spider.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        
                        }
                    
                    
                    
                    }
            
            }
             
            else if(robot_turleri.get(sira-1).equalsIgnoreCase("Seri")){
                System.out.println("seri islemleri");
                double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                double maxkolx=grafik.x2-3+seri.getKol_uzunlugu()*3;
                double minkolx=grafik.x2+3-seri.getKol_uzunlugu()*3;
                double maxkoly=grafik.y2-3+seri.getKol_uzunlugu()*3;
                double minkoly=grafik.y2+3-seri.getKol_uzunlugu()*3;
                
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2>maxkolx){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ seri.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                           System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2<minkolx){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ seri.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2>maxkoly){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ seri.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                             System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2<minkoly){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ seri.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                        
                        }
                    
                    
                    
                    }
                
            
            }
             
            else if(robot_turleri.get(sira-1).equalsIgnoreCase("Paralel")){
                System.out.println("paralel islemleri");
                double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                double maxkolx=grafik.x2-3+paralel.getKol_uzunlugu()*3;
                double minkolx=grafik.x2+3-paralel.getKol_uzunlugu()*3;
                double maxkoly=grafik.y2-3+paralel.getKol_uzunlugu()*3;
                double minkoly=grafik.y2+3-paralel.getKol_uzunlugu()*3;
                
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2>maxkolx){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ paralel.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                           System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2<minkolx){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ paralel.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2>maxkoly){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ paralel.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                             System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2<minkoly){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ paralel.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                        
                        }
                    
                    
                    
                    }
                
            
            }
            
            else if(robot_turleri.get(sira-1).equalsIgnoreCase("Hibrit")){
                System.out.println("Hibrit islemleri");
                double gecen_sure=0;
                
                System.out.print("Robotun baslangic konum bilgisi x = ");
                int robotx=klavye.nextInt();
                System.out.print("Robotun baslangic konum bilgisi y = ");
                int roboty=klavye.nextInt();
                grafik.x=(robotx-1)*30;
                grafik.y=(roboty-1)*30;
                grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                
                klavye.nextLine();
                grafik.repaint();
                if(hibrit.getGezgin_ismi().equalsIgnoreCase("tekerlekli")){
                    while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robotu sabitlemek icin s  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("s")){
                            gecen_sure=gecen_sure+hibrit.getSabitlenme_suresi()+hibrit.getGecis_suresi();
                            System.out.println("Robot sabitlendi, Yuk kola alindi");
                            System.out.println("Sabitlenme suresi eklendi , yukun kola gecis suresi eklendi ");
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                     grafik.x2=grafik.x;
                                        grafik.y2=grafik.y;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                    
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                               
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    robotx=robotx-1;
                                    
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                      if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                System.out.println("ileri gidildi "+adim+" kere");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                           for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            
                                   if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        
                        }
                    
                    
                    
                    }
                }
                if(hibrit.getGezgin_ismi().equalsIgnoreCase("paletli")){
                    while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robotu sabitlemek icin s  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("s")){
                            gecen_sure=gecen_sure+hibrit.getSabitlenme_suresi()+hibrit.getGecis_suresi();
                            System.out.println("Robot sabitlendi, Yuk kola alindi");
                            System.out.println("Sabitlenme suresi eklendi , yukun kola gecis suresi eklendi ");
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                    
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                               
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                    robotx=robotx-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                      if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                System.out.println("sol gidildi "+adim+" kere");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                           for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            
                                   if(hibrit.isEngel_gecermi()){
                                                gecen_sure=gecen_sure+hibrit.EngelGecmeSuresiBul();
                                                System.out.println("Engel gecme suresi hesaplandi ");
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                grafik.repaint();
                                
                        
                        }
                    
                    
                    
                    }
                    
                }
                if(hibrit.getGezgin_ismi().equalsIgnoreCase("spider")){
                    while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robotu sabitlemek icin s  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("s")){
                            gecen_sure=gecen_sure+hibrit.getSabitlenme_suresi()+hibrit.getGecis_suresi();
                            System.out.println("Robot sabitlendi, Yuk kola alindi");
                            System.out.println("Sabitlenme suresi eklendi , yukun kola gecis suresi eklendi ");
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)+1*30;
                                    robotx=robotx+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.x<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.x=(grafik.x)-1*30;
                                    robotx=robotx-1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y>550){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)+1*30;
                                    roboty=roboty+1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            
                                
                                
                                
                                    int bayrak=0;
                                    int bayrakt=0;
                                for (int i = 0; i < adim; i++) {
                                    
                                    if(grafik.y<30){
                                        System.out.println("Izgaradan disari cikmayiniz ");
                                        break;
                                    }
                                    grafik.y=(grafik.y)-1*30;
                                    roboty=roboty-1;
                                    gecen_sure=((double)10/hibrit.getGezinme_hizi())+gecen_sure;
                                     grafik.x2=grafik.x;
                grafik.y2=grafik.y;
                                    //System.out.println(robotx);
                                    
                                    for (int j = 0; j < engel_sayisi; j++) {
                                        if(robotx==engel_koordinat[j][0] && roboty==engel_koordinat[j][1]){
                                            System.out.println("Engel ile karsilasildi");
                                            bayrak=1;
                                            break;
                                    
                                            
                                        }
                                        
                                    }
                                    if(bayrak==1){
                                        bayrakt=1;
                                        break;
                                    }
                                }
                                
                                grafik.repaint();
                                
                                
                            if(bayrakt==1){
                                System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                                break;
                            }
                        
                        }
                    
                    
                    
                    }
                    
                }
                if(hibrit.getManipulator_ismi().equalsIgnoreCase("seri")){
                     double maxkolx=grafik.x2-3+hibrit.getKol_uzunlugu()*3;
                double minkolx=grafik.x2+3-hibrit.getKol_uzunlugu()*3;
                double maxkoly=grafik.y2-3+hibrit.getKol_uzunlugu()*3;
                double minkoly=grafik.y2+3-hibrit.getKol_uzunlugu()*3;
                
                
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2>maxkolx){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                           System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2<minkolx){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2>maxkoly){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                             System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2<minkoly){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                        
                        }
                    
                    
                    
                    }
                    
                    
                }
                if(hibrit.getManipulator_ismi().equalsIgnoreCase("paralel")){
                    double maxkolx=grafik.x2-3+hibrit.getKol_uzunlugu()*3;
                double minkolx=grafik.x2+3-hibrit.getKol_uzunlugu()*3;
                double maxkoly=grafik.y2-3+hibrit.getKol_uzunlugu()*3;
                double minkoly=grafik.y2+3-hibrit.getKol_uzunlugu()*3;
                
                klavye.nextLine();
                grafik.repaint();
                while(true)
                    {
                        String hareket_yonu;
                        System.out.println("Hareket yonu secin (sag,sol,ileri,geri) Robottan cikis icin q  Gecen toplam sure c ");
                        hareket_yonu=klavye.nextLine();
                        if(hareket_yonu.equalsIgnoreCase("q")){
                            break;
                        }
                        else if(hareket_yonu.equalsIgnoreCase("c")){
                            System.out.println("Gecen toplam sure "+gecen_sure+" saniye !");
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sag")){
                            
                            
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2>maxkolx){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                                
                            
                                
                            
                         
                        }
                        else if(hareket_yonu.equalsIgnoreCase("sol")){
                           System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.x2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.x2<minkolx){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.x2=grafik.x2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("ileri")){
                            System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2>582){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2>maxkoly){
                                            System.out.println("kol kisa disari cikmayiniz ! ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2+3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                                
                        }
                        else if(hareket_yonu.equalsIgnoreCase("geri")){
                             System.out.print("Kac kere = ");
                            int adim=klavye.nextInt();
                            klavye.nextLine();
                            int bayrak=0;
                                
                                
                                
                            
                                for (int i = 0; i < adim; i++) {
                                    for (int j = 0; j < 10; j++) {
                                        
                                        if(grafik.y2<-12){
                                            System.out.println("Izgaradan disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        if(grafik.y2<minkoly){
                                            System.out.println("kol kisa disari cikmayiniz ");
                                            bayrak=1;
                                            break;
                                        }
                                        grafik.y2=grafik.y2-3;
                                        
                                        gecen_sure=gecen_sure+ 1/ hibrit.getTasima_hizi();
                                        
                                    }
                                   if(bayrak==1){
                                       break;
                                   }
                                    
                                }
                                
                                grafik.repaint();
                        
                        }
                    
                    
                    
                    }
                    
                    
                }
                
                
                
                
                
                
            
            }
        
        
        
        }


                
         
         
         
         
         
         
         
         
         
         
         
         
         
         
       
        
        
    }
    
    
}
