package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {

        Point p1 = new Point(5,5);
        Point p2 = new Point(10,10);

        System.out.println(Point.distance(p1, p2));


        hello("world");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника  = " + r.area());

    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody);
    }

//    public static double distance(Point p1, Point p2){
//        double catet1sq = (p2.x - p1.x)*(p2.x - p1.x);
//        double catet2sq = (p2.y - p1.y)*(p2.y - p1.y);
//
//        double d = Math.sqrt(catet1sq + catet2sq);
//        return d;
//    }



}