package oop.encapsulation;

public class StaticKeyword {
    static double pi;
    int wheels;
    int seats;
    double mileage;

    public void sdfds(){

    }

//    public static void calculator(int wheels){
//        this.wheels=wheels;
//    }

    public static void main(String[] args) {
        StaticKeyword.pi = 3.14;

        StaticKeyword st1 = new StaticKeyword();
        st1.wheels=4;
        st1.pi = 5.6;
        StaticKeyword st2 = new StaticKeyword();
        StaticKeyword st3 = new StaticKeyword();
        System.out.println(st3.wheels);

    }
}
