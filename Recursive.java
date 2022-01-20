package CS221Course.src.DS_assignment8;

public class Recursive {
    /**
     * 1. Write a recursive method to convert from decimal to Binary.
     * 2. Write a recursive method to count the number of vowels in a given string.
     * 3. Write a recursive method to find a character in a string.
     */
    //todo convert from decimal to Binary
    public static void convertDecimal(int numbers) {
        /*if (numbers == 0) {
            return 0;
        } else {*/
        ///method will divide util 0
            if (numbers > 0){
                convertDecimal(numbers / 2); //recursive call with quotient
                System.out.print(numbers%2); // remainder will be print
        }
    }
    //todo count the vowels
    public static int countVowels(String word) {

        //base
        if (word.length() == 0) {
            return 0;
        } else {
            //storing the first character for latter use
            char ch = word.charAt(0);
            //checking if the first character is vowel or not
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                //calling the recursive method
                return 1 + countVowels(word.substring(1));
            }
            {
                //returning without counting anything
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

        System.out.print("Binary : ");
        convertDecimal(2);
        System.out.println("\n"+ countVowels("Robeil") + " : Vowels found.");
        System.out.println("This the character you were looking for : "+ findCharacter("Robeil",'l'));
    }
}
