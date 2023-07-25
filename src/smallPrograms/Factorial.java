package smallPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number which factorial you want  : ");
		Scanner scn = new Scanner(System.in);
		int num=scn.nextInt();
		int factorial=1;
		for(int i=factorial;i<num;i++) {
			factorial=factorial+factorial*i;
		}
		System.out.println(factorial+" is factorial of "+num);
	}

}
