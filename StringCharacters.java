import java.util.Arrays;
public class StringCharacters{
    public static void main(String[] args){
        String text = " To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer" 
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        int spaces = 0,
        vowels = 0,
        letters = 0;
        //YOUR CODE HERE
        char[] arr = new char[]{'a','e','i','o','u'};
        
        for (int i=0; i<text.length(); i++){
            boolean isVowel = false;
            for (int j=0;j<5;j++){
                if (text.charAt(i)== arr[j]){
                    vowels++;
                    isVowel =true;
                    break;
                }
            }
            if (Character.isLetter(text.charAt(i)))
            {
                letters++;
            }
        }
        spaces = text.split(" ").length-1;
        System.out.println("The text contained vowels: " + vowels + "\n"+ "consonants: " + (letters - vowels) + "\n"+ "spaces: " + spaces);
    }
}
