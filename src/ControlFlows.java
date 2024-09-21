import java.util.Arrays;

public class ControlFlows {
    public static void main(String[] args) {
//        int a = 3;
//        int b=3;
//        // if else if else
//
//        //brackets parenthesis
//        if(a>b){
//
//            System.out.println("A - Bden "+ (a-b) + " vahid boyukdur");
//        }else if(a<b){
//
//            System.out.println("A-Bden " + (b-a) + " vahid kicikdir");
//        }else{
//            System.out.println("a bye beraberdir a =" + a + " b = "+ b );
//        }

        //switch case
//        String day = "Monday";
//        switch(day){
//             case "Monday":{
//                 System.out.println("Bu gun Bazar ertesidir");
//                 break;
//             }
//            case "Tuesday":{
//                System.out.println("Bu gun 2 ci gun");
//                break;
//            }
//
//            default :{
//                System.out.println("Bu gun tetildir");
//                break;
//            }
//        }

        //Loops donguler ve ya tekrarlanma
        // for loop
//        for(int i =0; i<15; i++){
//            System.out.println("Salam dunya " + i);
//        }

//        for(int i =0, j=10; i<15; i++,j--){
//            System.out.println(i +j);
//        }

        //For each
//        int qiymet[] ={10,25,36,1,5,7,12,343};
//        int total = 0;
//        for(int product:qiymet) total +=product;
//
//
//        System.out.println(total);

        //Nested loop - ic ice dongu
        int matrix[][] = {{1,2,3},{2,3,4}};
//        System.out.println(Arrays.deepToString(matrix));
        //Nested For loop
//        for(int i =0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length;j++){
//                matrix[i][j]+=1;
//            }
//        }

        // Nested For each loop
//        for(int[] subArray:matrix){
//            for(int element:subArray){
//                element+=1;
//                System.out.println(element);
//            }
//        }
//
//        System.out.println(Arrays.deepToString(matrix));

        //while, do while

//       int a =0;
//        //To stop loop press CTRL + C
//        while(a<=25){
//            if(a<18)  System.out.println("Suruculuk vesiqesi ala bilmez");
//            a++;
//            if(a>=18) {
//                System.out.println("Suruculuk vesiqesi ala biler");
//                break;
//
//            };
//        }

//        boolean canli = true;
//        while(canli){
//            System.out.println("Men nefes aliram");
//        }

//        do{
//            System.out.println("Men nefes aliram");
//        }
//        while(canli);

//        int a =1;
//
//        while(a>2){
//            System.out.println(a);
//        }

//        /stem.out.println(a);
//        }while(a>2);

        //break loopu dayandirir
        //skip
        //continue verilmish shertde loopu oturur ve ya skip edir
        int sebet[]= {1,2,3,4};
        for(int i =0;i<sebet.length;i++){
            if(sebet[i]==2)continue;
            sebet[i]+=1;
        }
        System.out.println(Arrays.toString(sebet));


    }
}
