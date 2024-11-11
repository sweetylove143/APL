import java.util.*;

class p2 {
    public static void main(String args[]) {
        int n = 0, i, num, first, last, middle;
        int a[] = new int[20];
        try (Scanner s = new Scanner(System.in)) {
            // Input the elements in sorted order
            System.out.println("Enter elements in sorted order:");
            for (i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            
            // Input the value to search for
            System.out.println("Enter the search value:");
            num = s.nextInt();
        }
        
        
        // Initializing the binary search
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;
        
        // Binary search algorithm
        while (first <= last) {
            if (a[middle] < num) {
                first = middle + 1;
            } else if (a[middle] == num) {
                System.out.println(num + " found at position " + (middle + 1));
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        
        // If the element is not found
        if (first > last) {
            System.out.println(num + " is not found in the list.");
        }
    }
}

// import java.util.Scanner;

// class p2 {
//     public static void main(String args[]) {
//         int n, i, j, temp;
//         int a[] = new int[20];
//         Scanner s = new Scanner(System.in);
        
//         // Input total number of elements
//         System.out.println("Enter total number of elements:");
//         n = s.nextInt();
        
//         // Input the elements
//         System.out.println("Enter elements:");
//         for (i = 0; i < n; i++) {
//             a[i] = s.nextInt();
//         }
        
//         // Bubble sort algorithm
//         for (i = 0; i < n; i++) {
//             for (j = 0; j < n - 1; j++) {
//                 if (a[j] > a[j + 1]) {
//                     temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }
//         }
        
//         // Output the sorted elements
//         System.out.println("The sorted elements are:");
//         for (i = 0; i < n; i++) {
//             System.out.print("\t" + a[i]);
//         }
//     }
// }

