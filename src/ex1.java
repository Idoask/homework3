import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    isSwitchedNumber(122);

    }
    public static boolean isSwitchedNumber(int number){
        if (!ifNumberIsPositive(number)){
            return false;
        }
        if (howManyNumsInAInt(number)==1){
            return true;
        }
        int[] array=numsOtArray(number);
        for (int i = 0; i < array.length-1; i++) {
            if (isEven(array[i])==isEven(array[i+1])){
               return false;
            }
        }
        return true;
    }
    public static boolean isEven (int number){
        if (number%2!=0){
            return false;
        }
        return true;
    }
    public static int[] numsOtArray(int number){
        int[] array=new int[howManyNumsInAInt(number)];
        for (int i = array.length-1; i >=0; i--) {
            array[i]=number%10;
            number=number/10;
        }
        return array;
    }
    public static int howManyNumsInAInt (int number){
        int counter=0;
        while (number!=0){
            number=number/10;
            counter=counter+1;
        }
        return counter;
    }
    public static boolean ifNumberIsPositive (int number) {
        if (number < 0) {
            return false;
        }
        return true;
    }
}
