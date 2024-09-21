package oop.interfaces;

public interface Drivable {
    //implement
    int GLOBAL_VALUE =5;
    public default void  move(){
        System.out.println("Mashin hereket edir");
    };
}
