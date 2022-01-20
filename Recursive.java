package CS221Course.src.DS_assignment8;

public class Recursive {
    /**
     * 1. Write a recursive method to convert from decimal to Binary.
     * 2. Write a recursive method to count the number of vowels in a given string.
     * 3. Write a recursive method to find a character in a string.
     */
    //todo convert from decimal to Binary
    public static int convertDecimal(double numbers){

        return 0;
    }
    //todo count the vowels
    public static int countVowels(String word){

        if(word.length() == 0){
            return 0;
        } else {

            char ch = word.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u'){
                  return  1 + countVowels(word.substring(1));
            } else {
                return countVowels(word.substring(1));
            }
        }
    }
    //todo finding character from given string
    public static char findCharacter(String word, char character){

        if(word.length() == 0){
            return 0;
        }  else {
            if(character == word.charAt(0)){
                char found = word.charAt(0);
                return found;
            } else {
               char found = findCharacter(word.substring(1),character);
                return found;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(convertDecimal(12.03));
        System.out.println(countVowels("Robeil Brhanemeskel Aregawi"));
        System.out.println(findCharacter("Robeil",'l'));
    }
}
