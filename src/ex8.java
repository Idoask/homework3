import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println(stringToArray());
    }
    public static String subStringOfALetter(String input){
        String[] array=stringToArray();

    }

    public static String[] stringToArray(){
        Scanner sc=new Scanner(System.in);
        String[] array=new String[0];
        String number= sc.nextLine();
        while (number.length()>4){
            array=addNum(array,number);
            number=sc.nextLine();

        }
        return array;
    }
    public static String[] addNum(String[] input,String number){
        String[] array=new String[input.length+1];
        if (input.length==0){
            return new String[]{number};
        }
        for (int i = 0; i < input.length ; i++) {
            array[i]=input[i];
        }
        array[array.length-1]=number;
        return array;
    }
//    public static int getString (){
//        Scanner sc=new Scanner(System.in);
//        int[] array=new int[0];
//        }
//        return str;
//    }
}
