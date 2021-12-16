public class ex5 {
    public static void main(String[] args) {
        System.out.println(replaceLetters("iloveavocado"));

    }


    public static String replaceLetters(String input){
       String str= maxString(input);
        for (int i = 0; i <input.length() ; i++) {
            if (input.charAt(i)==str.charAt(1)){
                input = input.substring(0,i)+str.charAt(0)+input.substring(i+1,input.length());
            }
        }
        return input;
    }
    public static String maxString(String str){
        int max=0;
        String secondMax="";
        int counter=0;
        String maxChar = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    counter=counter+1;
                }
            }
            if (counter>max){
                secondMax=maxChar;
                max=counter;
                maxChar = ""+str.charAt(i);
            }
            counter = 0;
        }
        System.out.println(maxChar);
//        String src=src.c
        return ""+maxChar+secondMax;
    }
}
