
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class calc{
	public static void main(String[]args){
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("#");
        int a = sc.nextInt();
        System.out.print(" + - * /");
        String b = br.readLine();
        System.out.print("#");
        int d = sc.nextInt();
        int r = 0;
            if (b.equals("+"))r = a + d;
            else if(b.equals("-")) r = a - d;
            else if(b.equals("*")) r = a * d;
            else if(b.equals("/")) r = a / d;
        System.out.print("result ");
        System.out.println(r);
	}
}