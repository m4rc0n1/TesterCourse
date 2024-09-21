public class Methods {
    //or private
    public static void message(String message){
        System.out.println(message);
    }

    public static int calculator(int a, int b){
        return a+b;
    };
    public static void main(String[] args) {
        //return type
        int result = calculator(10,15);
        System.out.println(result);
        message("Salam dunya");
        message("sagol dunya");
    }
}
