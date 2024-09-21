package oop.inheritance;

public class B extends A{

    private int seats;
    @Override
    public void run(){
        super.setSeats(2);
        seats=super.getSeats();
        System.out.println("B- classindaki seats= " + seats);
    }
    public int getSeats() {
        return seats;
    }


}
