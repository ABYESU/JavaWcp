
public class Chapter09_Ex2 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a +"と"+ b +"の最大公約数は"+ gcd(a,b) +"です。");
	}
	
	static int gcd(int a,int b){
		while(a%b != 0){
			int c = a%b;
			a=b;
			b=c;
		}
		return b;
	}
}
