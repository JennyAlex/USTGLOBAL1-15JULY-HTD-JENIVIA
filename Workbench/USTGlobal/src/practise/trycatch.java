package practise;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner a=new Scanner(System.in)) {
	int aa=a.nextInt();
	int c=10/aa;
	System.out.println(c);
	//a.close();
	int b=a.nextInt();
	c=10/b;
	System.out.println(c);
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}

	}

}
