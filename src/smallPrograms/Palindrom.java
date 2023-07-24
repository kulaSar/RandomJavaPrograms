package smallPrograms;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		System.out.println("Enter the number you wana test?? ");
		Scanner scn= new Scanner(System.in);
		int num= scn.nextInt();
		System.out.println(num+"-------");
		int num1=num;
		int temp=0;
		while(num>0) {
			temp=temp*10+(num%10);
			num=num/10;
		}
		if(temp==num1) {
			System.out.println(num1+" : is a plindrom");
		}else {
			System.out.println(num1+" : is not a plindrom");
		}
	}

}
