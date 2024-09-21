public class IntMethods {
    public static void main(String[] args) {
//        int a =5;
//        //Wrapper class
//        // int -> Integer
//        Integer wrappedA = Integer.valueOf(a);
       int a=  Integer.parseInt("123"); //123
        Integer.valueOf("123"); //123
        Integer.compare(10,20); // -1
        Integer num1 = 123;
        num1.equals(123); //true
        int value = num1.intValue(); //123
        int MAX = Integer.MAX_VALUE;
        System.out.println(MAX); // 2147483647
        int MIN = Integer.MIN_VALUE; //
        System.out.println(MIN); // -2147483648

        // Math
        int absValue = Math.abs(-123); //123
        System.out.println(absValue);
        int max = Math.max(10,20); //20
        int min = Math.min(10,120); //10
        double power = Math.pow(2,3); //8.0
        double sqrt = Math.sqrt(25); //5.0
        long rounded = Math.round(10.5); //11
        double ceilValue = Math.ceil(10.3); //11.0
        double floorValue= Math.floor(10.7); //10.0
        double randomValue = Math.random(); // between 0 and 1
        System.out.println(randomValue);
        double logValue = Math.log(10);
        Integer.toString(123); // "123"



    }
}
