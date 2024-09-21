import java.util.Arrays;

public class HomeWork {
    /*
    1. [4,6,9,12,5,13] arrayinden 2 ye tam bolunen ededleri gosterin
    2. 2 eded int variable yaradin ve onlarin hasili 100 den boyukdurse konsola "ela"
        70 den boyukdurse "orta", 50 den boyukdurse "zeif" yazdirin, yerde qalan butun hallar ucun
        "belli olmayan netice" yazdirin
    3. Ilin aylarina uygun fesilleri yazdirin (meselen String ay = "Yanvar"; olarsa konsola qish fesli gelsin)
     */

    public static void main(String[] args) {

        //Tapshiriq 3
        String ay = "Noyabr";
        switch(ay){
            case "Yanvar", "Fevral", "Dekabr":
                System.out.println(ay + " qish fesli");
                break;
            case "Mart", "Aprel","May":
                System.out.println(ay +" yaz fesli");
                break;

            case "Iyun", "Iyul","Avqust":
                System.out.println(ay +" yay fesli");
                break;
            case "Sentyabr", "Oktyabr","Noyabr":
                System.out.println(ay +" payiz fesli");
                break;
            default :
                System.out.println(ay + " Duzgun ay daxil olunmayib");
                break;
        }




        //Tapshiriq 2
//        int a =15;
//        int b =3;
//        int c = a*b;
//        if(c>100)System.out.println("ela");
//        else if(c>70) System.out.println("orta");
//        else if(c>50) System.out.println("zeif");
//        else System.out.println("belli olmayan netice");






//Tapshiriq 1
//        String ad = "Orxan";
//        int qaliq =5%3;
//        System.out.println(qaliq);
//        int ededler[] = {4,6,9,12,5,13};
//        for(int i=0; i<ededler.length;i++){
//            if(ededler[i]%2==0){
//                System.out.println(ededler[i]);
//            }
//        }
//        for(int eded:ededler){
//            if(eded%2==0){
//              System.out.println(eded);
//          }
//        }

    }


}
