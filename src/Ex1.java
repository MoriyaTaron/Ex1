import java.util.Arrays;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
        public static int number2Int(String num) {

            int ans = -1;
            if (isNumber(num)){
                char[] charNum = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
                int[] valueNum = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
                int base = 0;
                int pow=1;
                for (int i = 0; i <= num.length() - 1; i++) {
                    base = 0;
                    for (int j = 0; j <= 9; j++) {
                        if (num.charAt(i) == charNum[j])
                            base = 10;
                    }if (base == 0)
                        i = num.length();
                }if (base ==10){
                    ans=Integer.parseInt(num);    //replacing the string that representing a decimel number to Integer
                         return ans;
                }int[]naturalNum =new int[num.length()-2];
                for(int i=2;i<=16;i++) {
                    if (num.charAt(num.length() - 1) == charNum[i]){
                        base = valueNum[i];
                }
                }for(int i=0, j =naturalNum.length - 1 ;i<naturalNum.length&&j >= 0 ;i++, j--) {
                    for (int x=0;x<charNum.length;x++) {
                        if (num.charAt(j)==charNum[x])
                            naturalNum[i]=valueNum[x];
                    }ans=0;
                }for (int i=0; i<= naturalNum.length-1;i++){
                    pow=1;
                    for (int j=1;j<=i;j++){
                        pow*=base;
                    }ans+= pow*naturalNum[i];
                }
            }
            return ans;
        }
        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;
            char[] validNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
            int[] valuenum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
            int decim = 0;
            int base = 0;
            if (a==null){
                ans =false;
                return ans;
            }
            for (int i = 0; i <= a.length() - 1; i++) {
                decim = 0;
                for (int j = 0; j <= 9; j++) {
                    if (a.charAt(i) == validNum[j])
                        decim = 10;
                }
                if (decim == 0)
                    i = a.length();
            }
            if (decim == 10)
                return true;
            if (a.length() < 3) return false;
            if (a.charAt(a.length() - 2) != 'b') return false;
            for (int i = 2; i <= 16; i++) {
                if (a.charAt(a.length() - 1) == validNum[i])
                    base = valuenum[i];
            }
            if (base == 0) return false;
            int[] numbers = new int[a.length() - 2];
              for (int i = 0; i < a.length()-2;i++) {
             char ch = a.charAt(i);
             for (int j = 0; j <= 15; j++) {
              if (ch == validNum[j]) {
              numbers[i] = valuenum[j];
             j = 16;
            }else numbers[i]=16;
            }if (numbers[i]==16) return false;
        }for (int i=0;i<=numbers.length-1;i++){
                if (numbers[i]>=base) return false;
            }

            return ans;
        }

        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = "";
            char[] validNum={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
            int[] valueNum={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            if (num<0||base<2||base>16)  return ans;
            char baseChar;
            String stringnum = Integer.toString(num,base); //using the function "to string(num,base)" for giving an integer that representing a num and integer that representing a base and the function whill calculate the number in the base i gave  then she whill return me back the number i gave in the base i gave represented as a string
            if (base==10){
                ans=stringnum;
            }else
            for (int i=2;i<=16;i++){
                if (valueNum[i]==base){
                    baseChar=validNum[i];
                    ans= stringnum+'b'+baseChar;
                }
            }


            return ans;
        }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            int n1Value = number2Int(n1);
            int n2Value = number2Int(n2);
            if (n1Value!=n2Value)
                ans = false;


            return ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0;
            int max = Integer.MIN_VALUE; // using the "Min_Value" function for define Max as the minimum number, because i want that the first  valid valiue from the arr to bigger then this.
            for(int i=0;i<arr.length;i++){
                if (arr[i]!= null && number2Int(arr[i])!=-1){
                    if (number2Int(arr[i]) > max){
                        ans =i;
                        max=number2Int(arr[i]);
                    }

                }
            }
            return ans;
        }
}
