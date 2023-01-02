
public class Chapter08_1 {
	public static void main(String[] args) {
		int far=10;
		
		if(far<=5) {
			System.out.println("とても近いです");
		}else if(5<far && far<=10) {
			System.out.println("近いです");
		}else if(10<far && far<=15) {
			System.out.println("遠いです");
		}else if(15<far) {
			System.out.println("とても遠いです");
		}
	}
}
