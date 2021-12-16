public class ex4 {
    public static void main(String[] args) {
        int[] array={15,19,17,16,18,14};
        areAllTheNumbersBetweenMaxAndMiniAreInTheArray(array);
    }
    public static boolean areAllTheNumbersBetweenMaxAndMiniAreInTheArray(int[] arr1){
        if (ifTherAreMoreThenOneOfTheSameValue(arr1)){
            return false;
        }
        int miniValue= minivalue(arr1);
        int maxvalue=maxvalue(arr1);
        for (int i =miniValue ; i <=maxvalue; i++) {
            if (ifValueIsInArrayAreNot(arr1,i)==false){
                return false;
            }
        }
        return true;
    }
    public static boolean ifValueIsInArrayAreNot(int[] arr1,int number){
        for (int i = 0; i <arr1.length; i++) {
            if (arr1[i]==number){
                return true;
            }
        }
        return false;
    }
    public static int minivalue(int[] arr1){
        int mini= 2147483647;
        for (int i = 0; i < arr1.length ; i++) {
            if (mini>arr1[i]){
                mini=arr1[i];
            }
        }
        return mini;
    }
    public static int maxvalue(int[] arr1) {
        int max=-2147483648;
        for (int i = 0; i <arr1.length ; i++) {
            if (max<arr1[i]){
                max=arr1[i];
            }
        }
        return max;
    }
    public static boolean ifTherAreMoreThenOneOfTheSameValue(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i]==arr1[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
