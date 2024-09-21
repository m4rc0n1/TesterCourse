public class ClassesVsObjects {

    public static void main(String[] args) {
        // class vs objects
        //capital camel case, pascal case
        class NewEmployee{
            int yash;
            double maash;
            String ad;
            String soyad;
            public boolean ishleyeBiler(int yash){
                return this.yash>=yash;
            }
        }
        NewEmployee employee1 = new NewEmployee();
        NewEmployee employee2 = new NewEmployee();
        employee1.ad= "Orxan";
        employee1.maash= 3000;
        employee1.soyad= "Allahverdiyev";
        employee1.yash = 17;
//        System.out.println(employee1.maash);
//        System.out.println(employee1.ad);
        System.out.println(employee1.ishleyeBiler(16) ? "Bu ischi ishleye biler" : "Bu ischi ishleye bilmez");


//        employee1 = employee2;
//        System.out.println(employee1);
//        System.out.println(employee2);

    }
}
