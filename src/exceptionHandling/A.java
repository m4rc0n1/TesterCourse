package exceptionHandling;

public class A {
    public static int calculator(int i, int j){
        try{
//            System.out.println(i/j);
            if(j==0) throw new RuntimeException("J = 0 a beraber olduguna gore bolme emeliyyati mumkun deyil");
            return i/j;
        }
        catch(ArithmeticException e){
            System.out.println("Riyazi sehvlik bash verdi: " + e);
            return 0;
        }
        catch(Exception e){
            System.out.println("Her hansisa sehvlik bash verdi, komandaya bildirin");

            return -1;
        }
        //optional
//        finally{
//            System.out.println("Temizlenme bash verdi");
//        }

    }
    public static void main(String[] args) {
        int i =10;
        int j = 0;
        //unchecked
        if(j==0) throw new RuntimeException("J = 0 a beraber olduguna gore bolme emeliyyati mumkun deyil");
        calculator(i,j);

//                Throwable
//        Exception           Error
//        ArithmeticException
//        Runtime

    }
}
