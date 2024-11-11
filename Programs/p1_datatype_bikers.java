// import java.lang.*;

// class p1 {
//     static byte b;
//     static short s;
//     static int i;
//     static long l;
//     static float f;
//     static double d;
//     static char c;
//     static boolean bl;

//     public static void main(String[] args) {
//         System.out.println("The default values of primitive data types are:");
//         System.out.println("Byte :"+b);
//         System.out.println("Short :"+s);
//         System.out.println("Int :"+i);
//         System.out.println("Long :"+l);
//         System.out.println("Float :"+f);
//         System.out.println("Double :"+d);

//         // For char, show its default Unicode value
//         System.out.println("Char :"+c + " (Unicode: \\u" + String.format("%04x", (int)c) + ")");
        
//         System.out.println("Boolean :"+bl);
//     }
// }

import java.util.*;

class p1{
    public static void main(String[] args) {
        float s1, s2, s3, s4, s5, average;
        Scanner s = new Scanner(System.in);
        
        // Input for the speeds of the racers
        System.out.println("Enter speed of first racer:");
        s1 = s.nextFloat();
        
        System.out.println("Enter speed of second racer:");
        s2 = s.nextFloat();
        
        System.out.println("Enter speed of third racer:");
        s3 = s.nextFloat();
        
        System.out.println("Enter speed of fourth racer:");
        s4 = s.nextFloat();
        
        System.out.println("Enter speed of fifth racer:");
        s5 = s.nextFloat();
        
        // Calculate the average speed
        average = (s1 + s2 + s3 + s4 + s5) / 5;
        
        // Determine which racers qualify
        if (s1 > average) {
            System.out.println("First racer is qualify racer:");
        } else if (s2 > average) {
            System.out.println("Second racer is qualify racer:");
        } else if (s3 > average) {
            System.out.println("Third racer is qualify racer:");
        } else if (s4 > average) {
            System.out.println("Fourth racer is qualify racer:");
        } else if (s5 > average) {
            System.out.println("Fifth racer is qualify racer:");
        }
    }
}

