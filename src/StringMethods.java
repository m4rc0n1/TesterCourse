import java.util.Arrays;

public class StringMethods  {
    public static void main(String[] args) {
        String full_name= "Orxan Allahverdiyev";
        String full_name1 = "orxan Allahverdiyev";
        char herf =full_name.charAt(1);
        int length= full_name.length();
        full_name.substring(1);
        full_name.substring(1,5);
        full_name.contains("Orxan");
        full_name.equals(full_name1);
        full_name.equalsIgnoreCase(full_name1);
        full_name.toLowerCase();
        full_name.toUpperCase();
        full_name.trim();
        full_name.replace("e","u");
        full_name.replaceAll("e","u");
        String[] ad= full_name.split(" ");
        System.out.println(Arrays.toString(ad));
        full_name.indexOf("l");
        System.out.println(full_name.indexOf("l"));
        System.out.println(full_name.lastIndexOf("l"));
        full_name.isEmpty();
        full_name.concat(full_name1);
        System.out.println(full_name.concat(full_name1));
        char[] array= full_name.toCharArray();
        System.out.println(Arrays.toString(array));











    }
}
