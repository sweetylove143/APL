// import java.io.*; // Importing io package

// class p5 { // Defining class
//     public static void main(String[] args) { // Defining main method
//         try { // Using try
//             FileInputStream fis = new FileInputStream("Input.txt"); // Reading from file
//             BufferedInputStream bis = new BufferedInputStream(fis); // Buffering the input

//             int i; // Declaring variables
//             int occur = 0;

//             while ((i = bis.read()) != -1) { // Using while loop
//                 char a = (char) i; // Using type casting
//                 if (a == args[0].charAt(0)) { // Using if condition
//                     occur++; // Incrementing variable
//                 }
//             } // Closing while loop

//             System.out.println("The letter " + args[0].charAt(0) + " occurs " + occur + " times in the file.");

//             bis.close(); // Closing the BufferedInputStream
//             fis.close(); // Closing the FileInputStream

//         } catch (Exception ex) { // Using catch
//             System.out.println(ex.getMessage());
//         } // Closing try-catch
//     } // Closing main
// }


//B
import java.util.Scanner;

class p5 {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        str = sc.nextLine();
        
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev += str.charAt(i); // Building the reversed string
        }
        
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        
        sc.close(); // Closing the Scanner
    }
}


