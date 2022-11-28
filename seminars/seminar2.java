package seminars;

import java.util.Arrays;
import java.util.Random;

public class seminar2 {
    public static void main(String[] args) {
    //    перевернуть массив.
        // int[] arr1 = new int[20];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = (int) Math.round(Math.random() * 2001);
            
        // } 

        // int[] arr2 = new int[arr1.length];
        // for (int i = arr1.length - 1; i > 0;) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         arr2[j] = arr1[i];
        //         i--;
        //     }
        // }

        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        
// переворачивать строку.

        // String s = "hello everyone" + "and you hello";
        // StringBuilder strb = new StringBuilder(s);
        // strb.append("Gi");
        // strb.reverse();
        // s = strb.toString();
        // System.out.println(s);

// метод для проверки палиндрома.

        // boolean isPalindrome(String s) {
        //     int n = s.length();
        //     for (int i = 0; i < (n/2); ++i) {
        //        if (s.charAt(i) != s.charAt(n - i - 1)) {
        //            return false;
        //        }
        //     }
          
        //     return true;
        //   }


        // // замерка времени.
        // String s = "hello everyone";
        // StringBuilder strb = new StringBuilder(s);
        // long start = System.currentTimeMillis();
        // for (int i = 0; i < 100000; i++) {
        //     s += Character.toString(i);
        // }
        // System.out.println(System.currentTimeMillis() - start);

        // long start2 = System.currentTimeMillis();
        // for (int i = 0; i < 100000; i++) {
        //     strb.append(Character.toString(i));
        // }
        // System.out.println(System.currentTimeMillis() - start2);

    }



    
// рекурсивный палиндром
//    public static String reverseStringWithRecursion(String inputString) {
//         String rightPart;
//         String leftPart;
 
//         int length = inputString.length();
 
//         // заканчиваем рекурсивный обход
//         if (length <= 1) {
//             return inputString;
//         }
 
//         leftPart = inputString.substring(0, length / 2);
 
//         rightPart = inputString.substring(length / 2, length);
 
//         // рекурсивно переворачиваем левую и правую часть входной строки
//         return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
//     }
    
}






// находить наименьшее окно в строке
// import java.util.*;
// class Main
// {
    // public static String pickSubstring(String samp_str ,String pat_str)
	// {
    //     int ln1  = samp_str.length();
    //     int ln2  = pat_str.length();
    //     if(ln1 < ln2)
	// 	{ 
    //         System.out.println("No such window can exist");
    //         return "";
    //     }
    //     int gvn_strg [] = new int[256];
    //     int pat_stgr [] = new int[256];
    //     for(int i=0;i<ln2;i++)
    //         pat_stgr[pat_str.charAt(i)]++;
    //     int ctr = 0,start = 0,start_index = -1,min_length = Integer.MAX_VALUE;
    //     for(int j=0;j<ln1;j++)
	// 	{
    //         gvn_strg[samp_str.charAt(j)]++;
    //         if(pat_stgr[samp_str.charAt(j)] != 0 && gvn_strg[samp_str.charAt(j)] <= pat_stgr[samp_str.charAt(j)])
    //             ctr++;
    //         if(ctr == ln2)
	// 		{
    //             while(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
	// 			{
    //                 if(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
    //                     gvn_strg[samp_str.charAt(start)]--;
    //                 start++;
    //             }
    //             int length_window = j - start + 1;
    //             if(min_length > length_window)
	// 			{
    //                 min_length = length_window;
    //                 start_index = start;
    //             }
    //         }
    //     }
    //     if(start_index == -1)
	// 	{
    //         System.out.println("No such window exists");
    //         return "";
    //     }
    //     return samp_str.substring(start_index,start_index + min_length);
    // }
    // public static void main(String args[])
	// {
    //     String str ="welcome to w3resource";
    //     String pat ="tower";
    //     System.out.println("The given string is: "+str);
    //     System.out.println("Characters to find in the main string are: "+pat);
        
    //     System.out.print("The smallest window which contains the finding characters is : " + pickSubstring(str, pat));
    // }
// }


// метод replace.

// public class Test {
//     public static void main(String[] args) {
 
//         String oldString = "ABC";
//         String newString =  oldString.replace('A', 'B');
 
//         System.out.println("Old string: " + oldString);
//         System.out.println("New string: " + newString);
//     }
// }