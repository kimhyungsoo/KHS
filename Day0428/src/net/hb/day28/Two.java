package net.hb.day28;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		int age = 1;//선언  
	  age = 1; //값대입=할당=assignment
		Scanner stdin = new Scanner(System.in);
	  System.out.print("\n나이입력? ");
	  System.out.print("\n이름입력?");
	  age=stdin.nextInt();//반드시 정수형 입력
	  
	  
	  
	  
	  System.out.println("이름");
		System.out.println("나이=" + age);
		System.out.println("\n영수증출력 10:06 10:31 ");
		stdin.close();//추천
	}//main end

}//class END
