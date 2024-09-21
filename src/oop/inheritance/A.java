package oop.inheritance;

public class A {
    private int seats;

   public void run(){
       System.out.println(seats);
   }
   //getter and setters


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
       if(seats <1) System.out.println("A-classinda yazdiginiz reqem yanlishdir");
      else this.seats = seats;
    }
}
