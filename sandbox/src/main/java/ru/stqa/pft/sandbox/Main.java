package ru.stqa.pft.sandbox;

public class Main {

	public static double distance(Point p1, Point p2) {
		double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return distance;
	}

	public static void main(String[] args) {
		Point p1 = new Point(4.5, 6.7);
		Point p2 = new Point(7.9, 8.4);
		System.out.println(p1.distance(p2));
		System.out.println(distance(p1, p2));

//		hello ("world");
//		hello ("user");
//		hello ("alexa");
//
//		double l = 5;
//		System.out.println( "Площаль квадрата со стороной " + l + " = " + area (l) );
//
//		double a = 5;
//		double b = 6;
//		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
//	}
//
//	public static void hello(String somebody){
//		System.out.println("Hello, " + somebody + "!");
//	}
//	public static double area(double l){
//		return l*l;
//	}
//
//	public static double area(double a, double b){
//		return a*b;
	}
}






