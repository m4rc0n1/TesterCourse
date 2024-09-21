package oop.polymorphism;

public class SportCar implements YanacaqNovu {
    public void drive(){
        System.out.println("Yarish mashini gedir");
    }
    public void fuel(){
        System.out.println("100 oktan teleb edir");
    }
    public void drive(String mode){
        System.out.println("Yarish mashini " + mode + " modunda gedir");
    }

}
