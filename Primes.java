import java.util.Scanner;
public class Primes {
	public static boolean isPrime(int n){
		int z = 0;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0) z = 1;
			//System.out.println(n%i);
		}
		if(z < 1)return true;  //если простое
		else return false;   //если не простое
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int x = in.nextInt();
		int x = 0;
		for(int i = 2; i<101; i++){
			System.out.println(i+" "+isPrime(i));
		}
		//boolean y = isPrime(x);
		//System.out.println(y);
 	}
}