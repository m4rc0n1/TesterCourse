package bankomat;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        NewAccount newAccount = new NewAccount();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("***Bankomat proqramina xosh gelmisiniz***");
            System.out.println("Zehmet olmasa secim edin (1,2,3,4,5,6): " +
                    "\n 1. Qeydiyyat " +
                    "\n 2. Deposit " +
                    "\n 3. Withdraw" +
                    "\n 4. Balansi goster" +
                    "\n 5. Pin deyish" +
                    "\n 6. Hesabi sil");
            int secim = 0;
            if(scanner.hasNextInt()){
                secim =  scanner.nextInt();
                if(secim == -100){
                    System.out.println("Proqram dayanir...");
                    break;
                }
                switch(secim){
                    case 1:{
                        newAccount.register();
                        break;
                    }
                    case 2:{
                        newAccount.deposit();
                        break;
                    }
                    case 3:{
                        newAccount.withdraw();
                        break;
                    }
                    case 4:{
                        newAccount.viewAccountBalance();
                        break;
                    }
                    case 5:{
                        newAccount.changePin();
                        break;
                    }

                    case 6:{
                        newAccount.deleteAccount();
                        break;
                    }
                    default:{
                        System.out.println("Yanlis sorgu, Zehmet olmasa (1,2,3,4,5,6) girin");
                    }
                }
            }
            else{
                System.out.println("Yanlis sorgu, Zehmet olmasa (1,2,3,4,5,6) girin");
                newAccount.waitResponse();
                scanner.next();
            }
        }
    }
}
