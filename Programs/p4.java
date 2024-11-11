// //A
// abstract class Shape {
//     abstract double area();
// }

// class Rectangle extends Shape {
//     double length = 15, breadth = 2.5;

//     double area() {
//         return length * breadth;
//     }
// }

// class Triangle extends Shape {
//     double base = 4, height = 6.5;

//     double area() {
//         return 0.5 * base * height;
//     }
// }

// class Square extends Shape {
//     double side = 7;

//     double area() {
//         return side * side;  // Area of a square is side^2
//     }
// }

//  class p4{
//     public static void main(String[] args) {
//         Rectangle r1 = new Rectangle();
//         Triangle t1 = new Triangle();
//         Square s1 = new Square();

//         System.out.println("The area of the rectangle is: " + r1.area());
//         System.out.println("The area of the triangle is: " + t1.area());
//         System.out.println("The area of the square is: " + s1.area());
//     }
// }


//B

// class A {
//     int length, breadth;

//     A() {
//         length = 30;
//         breadth = 60;
//     }
// }

// class B extends A {
//     int height;

//     B() {
//         super(); // Calls the constructor of class A
//         height = 40;
//     }

//     int volume() {
//         return length * breadth * height;
//     }
// }

// public class p4 {
//     public static void main(String[] args) {
//         B b1 = new B();
//         int r = b1.volume();
//         System.out.println("The volume is: " + r);
//     }
// }

//C
// interface A {
//     void display();
// }

// class B implements A {
//     public void display() {
//         System.out.println("B's method");
//     }
// }

// class C extends B {
//     public void callMe() {
//         System.out.println("C's method");
//     }
// }

// public class p4 {
//     public static void main(String[] args) {
//         C c1 = new C();
//         c1.display();  // Calls the display method from class B
//         c1.callMe();   // Calls the callMe method from class C
//     }
// }


//D

interface Area {
    float compute(float x, float y);
}

class Rectangle {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Triangle {
    public float compute(float x, float y) {
        return (x * y / 2);
    }
}

class Result extends Rectangle implements Area {
    @Override
    public float compute(float x, float y) {
        return super.compute(x, y); // Calls the compute method from Rectangle
    }
}

class Result1 extends Triangle implements Area {
    @Override
    public float compute(float x, float y) {
        return super.compute(x, y); // Calls the compute method from Triangle
    }
}

public class p4 {
    public static void main(String[] args) {
        Result rect = new Result();
        Result1 tri = new Result1();
        Area a;

        a = rect;
        System.out.println("Area of rectangle = " + a.compute(30, 15));

        a = tri;
        System.out.println("Area of triangle = " + a.compute(20, 4));
    }
}
