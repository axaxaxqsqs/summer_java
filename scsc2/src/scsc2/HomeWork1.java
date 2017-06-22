package scsc2;

import java.util.Scanner;

public class HomeWork1 {
	
	public static boolean isEnableTriangle(int x, int y, int z){
		if(x+y>z&&x+z>y&&z+y>x)
			return true;
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(isEnableTriangle(x, y, z)==false)
			System.out.println("삼각형을 만들 수 없습니다.");
		else
			System.out.println("삼각형을 만들 수 있습니다.");		
	}
}
