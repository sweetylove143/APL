
// class A {

//     int l = 15, b = 50;

//     void display() {
//         System.out.println(l);
//         System.out.println(b);
//     }
// }

// class p3 {

//     public static void main(String args[]) {
//         A a1 = new A();
//         a1.display();
//     }
// }

// class p3 {
//     int id;
//     String name;
//     int age;

//     // creating two-arg constructor
//     p3(int i, String n) {
//         id = i;
//         name = n;
//     }

//     // creating three-arg constructor
//     p3(int i, String n, int a) {
//         id = i;
//         name = n;
//         age = a;
//     }

//     // method to display p3ent details
//     void display() {
//         System.out.println(id + " " + name + " " + age);
//     }

//     public static void main(String args[]) {
//         // creating p3ent objects
//         p3 s1 = new p3(132, "Karan");
//         p3 s2 = new p3(232, "Aryan", 25);

//         // displaying p3ent information
//         s1.display();
//         s2.display();
//     }
// }


class A {
    int l = 20, b = 30;

    int area() {
        return l * b;
    }

    int area(int l, int b) {
        return l * b;
    }
}
 class p3 {
    public static void main(String[] args) {
        A a1 = new A();
        int r1 = a1.area();
        System.out.println("The area is: " + r1);
        
        int r2 = a1.area(5, 20);
        System.out.println("The area is: " + r2);
    }
}
