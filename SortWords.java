import java.util.Arrays;
public class SortWords{
    public static void main(String[] args){
        String text = " To be or not to be, that is the question; "
        +"Whether `tis nobler in the mind to suffer" 
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        String[] newText = text.split(" ");
        
        //Bubble sort
        for (int i=0; i<newText.length-1; i++){
            for (int j=i+1; j<newText.length-1; j++){
                if (newText[i].compareTo(newText[j])>0){
                    String temp = newText[i];
                    newText[i]=newText[j];
                    newText[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(newText));   
    }
}
