package bankomat;

import java.util.Scanner;

public class NewAccount {
   private String ad;
   private String soyad;
   private int pin;
   private ValyutaType valyuta;
   private double balance;

   public void waitResponse(){
       try{
           Thread.sleep(2000);
       }catch(InterruptedException e){
           throw new RuntimeException(e);
       }
   }

   public void deleteAccount(){
       if(ad ==null){
           System.out.println("Sistemde  istifadeci yoxdur.");
           waitResponse();
           return;
       }
       Scanner scanner = new Scanner(System.in);
       System.out.println("Hesabi silmek ucun PIN yazin");
       while(true){
           if(scanner.hasNextInt()){

               int pin = scanner.nextInt();
               if(this.pin==pin){
                       System.out.println(ad + " " + soyad + " adli hesab ugurla silindi");
                       ad = null;
                       soyad = null;
                       pin = 0;
                       valyuta = null;
                       balance = 0.0;
                       break;
                   }else{
                       System.out.println("Girdiyiniz PIN yanlishdir");
                   }
               }else{
                     System.out.println("Zehmet olmasa yalniz reqem daxil edin.");
                     scanner.next();
                }
           }
       waitResponse();
   }

   public void changePin(){
       if(ad ==null){
           System.out.println("Sistemde  istifadeci yoxdur.");
           waitResponse();
           return;
       }
       System.out.println("PIN kodu deyishmek ucun ad soyadinizi yazin: Numune (Eli Eliyev) ");
       Scanner scanner = new Scanner(System.in);
       while(true){
           String adSoyad =  scanner.nextLine();
           if(adSoyad.equals(ad + " " + soyad)){
               System.out.println("Ad soyad duzgundur, yeni PIN yazin");
               while(true){
                   if(scanner.hasNextInt()){
                       int yeniPin = scanner.nextInt();
                       if(yeniPin == pin){
                           System.out.println("Yeni PIN kohne PIN ile eyni ola bilmez");
                       }
                       else if(yeniPin >=1000 && yeniPin <=9999){
                           pin = yeniPin;
                           System.out.println("PIN ugurla deyishdi");
                           break;
                       }
                       else{
                           System.out.println("PIN 4 reqemli olmalidir. Zehmet olmasa duzgun pin yazin");
                           scanner.next();
                       }
                   }
                   else{
                       System.out.println("PIN yalniz reqemlerden ibaret olmalidir.");
                       scanner.next();
                   }
               }
               break;
           }else{
               System.out.println("Girdiyiniz ad soyad yanlisdir");
           }
       }
       waitResponse();
   }

   public String  viewAccountBalance(){
       if(ad ==null){
           System.out.println("Sistemde  istifadeci yoxdur.");
           waitResponse();
           return "";
       }
       String balanceInfo = "Cari balans: "+ balance + " "+ valyuta.getValyutaAd();
       System.out.println(balanceInfo);
       waitResponse();
       return balanceInfo;
   }

   public void withdraw(){
       if(ad ==null){
           System.out.println("Sistemde  istifadeci yoxdur.");
           waitResponse();
           return;
       }
       Scanner scanner = new Scanner(System.in);
       System.out.println("Zehmet olmasa cixaris ucun mebleg yazin");
       while(true){
           double money =0;
           if(scanner.hasNextDouble()){
               money = scanner.nextDouble();
               if(money<=0) {
                   System.out.println("Zehmet olmasa duzgun mebleg daxil edin");
               }else{
                   if(money>balance){
                       System.out.println("Girdiyiniz mebleg balansda yoxdur. " + viewAccountBalance());
                   }else{
                       balance-=money;
                       System.out.println(money +" " + valyuta.getValyutaAd() +"  ugurla cixarildi. " +viewAccountBalance());
                       break;
                   }
               }
           }
           else{
               System.out.println("Zehmet olmasa yalniz reqem daxil edin");
               scanner.next();
           }
       }
       waitResponse();
   }


   public void deposit(){
       if(ad ==null){
           System.out.println("Sistemde  istifadeci yoxdur.");
           waitResponse();
           return;
       }
       Scanner scanner = new Scanner(System.in);
       System.out.println("Zehmet olmasa deposit ucun mebleg yazin");
       // 1 ci sert - inputun double oldugunu yoxla
       // 2 ci sert - yalniz musbet edede icaze ver
       while(true){
           double money =0;
           if(scanner.hasNextDouble()){
               money = scanner.nextDouble();
               if(money<=0) {
                   System.out.println("Zehmet olmasa duzgun mebleg daxil edin");

               }else{
                   balance+=money;
                    System.out.println(money +" " + valyuta.getValyutaAd() +"  ugurla elave edildi. " + viewAccountBalance());
                    break;
               }
           }
           else{
               System.out.println("Zehmet olmasa yalniz reqem daxil edin");
               scanner.next();
           }
       }
       waitResponse();
   }



   public void register(){
       if(ad !=null){
           System.out.println("Sistemde artiq istifadeci movcuddur. Istifadeci adi: " + ad);
           return;
       };
       Scanner scanner = new Scanner(System.in);
       System.out.println("Zehmet olmasa adinizi yazin: ");
       String ad =scanner.nextLine();
       this.ad=ad;
       System.out.println("Zehmet olmasa soyadinizi yazin: ");
       String soyad =scanner.nextLine();
       this.soyad=soyad;
       while(true){
            System.out.println("Zehmet olmasa pin yazin: ");
            int pin =scanner.nextInt();
            if(pin<1000 || pin>9999) System.out.println("Girdiyiniz pin 4 reqemli deyil");
            else {
                this.pin = pin;
                break;
            }
        }
       scanner.nextLine();

       while(true){
           System.out.println("Zehmet olmasa valyuta yazin: AZN, USD, EUR");
           String valyuta =scanner.nextLine();
           try{
               this.valyuta = ValyutaType.fromString(valyuta);
               break;
           }catch(IllegalArgumentException error){
               System.out.println("Duzgun valyuta secin: AZN, USD, EUR");
           }
       }
       System.out.println(ad  +" adli hesab ugurla yaradildi, cari balans 0.0 " +valyuta.getValyutaAd());
       waitResponse();
   }
}
