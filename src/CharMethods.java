public class CharMethods {
    public static void main(String[] args) {
        //Char methods
        char simvol = ' ';
        boolean herfdir = Character.isLetter('a'); //true
        Character.isDigit('5'); //true
        Character.isWhitespace(' '); //true
        Character.isUpperCase('a'); //false
        Character.isLowerCase('A'); //false
        char lowerA = Character.toLowerCase('A');// a
        Character.toUpperCase('b'); //B
        Character.toString('a'); // "a"
        int num = Character.getNumericValue('3'); //3
        Character.isAlphabetic('a'); //true
        Character.isLetterOrDigit('1'); //true
        boolean isSpace = Character.isSpaceChar('\u2000'); //UNICODE \u2000
        int asciiValue = Character.codePointAt( new char[] {'a','b','c','d'},1); //brings ASCII value of b
        System.out.println(asciiValue);






    }
}
