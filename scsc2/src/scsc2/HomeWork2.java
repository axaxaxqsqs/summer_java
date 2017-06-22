package scsc2;

import java.util.Scanner;

public class HomeWork2 {
	
	public static boolean isEnableTri(double l1, double l2, double l3){
		if(l1+l2>l3&&l1+l3>l2&&l3+l2>l1)
			return true;
		return false;
	}
	
	public static double triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		return 0.5*Math.abs((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3));
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3;
		double l1, l2, l3, t1;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		l1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		l2 = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
		l3 = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
		
		
		if(isEnableTri(l1, l2, l3)==false)
			System.out.println("삼각형을 만들 수 없습니다.");
		else{
			t1 = triangle(x1, y1, x2, y2, x3, y3);
			System.out.println("삼각형의 면적은 " + t1 + "입니다.");
		}
	}
}
