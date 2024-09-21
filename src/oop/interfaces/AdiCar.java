package oop.interfaces;

public class AdiCar implements YanacaqNovu{
    @Override
    public void move(){
        System.out.println("Adi mashin hereket edir");
    }
    @Override
    public void fuel(){
        System.out.println("Adi mashin 95 oktanli benzin teleb edir");
    }
}
