public class Constructors {
   static class Car{
        int seats;
        int wheels;
        double mileage;
        //default Constructor
//        Car(){}
        //no-arg constructor
        Car(){
            mileage = 5;
            seats=0;
        }
       // arg constructor
        Car(int wheels){
         this();
            this.wheels = wheels;
        }
        Car(int seats,int wheels){
            this(5);
        }
    }

    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car(10);

        System.out.println(car1.mileage);
        System.out.println(car2.mileage);
    }
}
