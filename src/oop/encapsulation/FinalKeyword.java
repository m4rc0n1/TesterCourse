package oop.encapsulation;

public class FinalKeyword {
    // deyishmeyen variable
    final String COPMANY_NAME = "COMPANY1";
//    final int mileage;
    final double pi=3.14;
    int wheels;
    int seats;

    public static void main(String[] args) {
        final FinalKeyword fn1 = new FinalKeyword();
        FinalKeyword fn2 = new FinalKeyword();
        fn1.seats=4;
        final int mileage;
        mileage=5;
//        mileage=6;

        int numberOfProducts =10;
        final int maxProductNum =15;

        //Sehrli reqem, deyer - magic values
        if(numberOfProducts > maxProductNum){
            System.out.println("Sebetde yer yoxdu");
        }

    }
}
