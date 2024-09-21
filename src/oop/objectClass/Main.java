package oop.objectClass;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("RS 77"); // reference kodu 4324
        Audi audi1 = new Audi("RS 77");// reference kodu 5436
//        System.out.println(audi);
//        System.out.println(audi1);
        System.out.println(audi.equals(audi1)); // == boolean qaytarir ya true ya false
    }
}
