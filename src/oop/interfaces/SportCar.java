package oop.interfaces;

public class SportCar implements Drivable, YanacaqNovu{
    int a = GLOBAL_VALUE;


    @Override
    public void fuel(){
        System.out.println("Yarhis mashini 100 oktanli benzinle ishleyir");
    }

}
