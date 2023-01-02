
public class Chapter08_2 {
	public static void main(String[] args) {
		String day="Sunday";
		
		if(day.equals("Sunday")==true) {
			System.out.println("日曜日です");
		}else  if(day.equals("Monday")==true) {
			System.out.println("月曜日です");
		}else if(day.equals("Tuesday")==true) {
			System.out.println("火曜日です");
		}else if(day.equals("Wednesday")==true) {
			System.out.println("水曜日です");
		}else if(day.equals("Tursday")==true) {
			System.out.println("木曜日です");
		}else if(day.equals("Friday")==true) {
			System.out.println("金曜日です");
		}else if(day.equals("Saturday")==true) {
			System.out.println("土曜日です");
		}else {
			System.out.println("曜日ではありません");
		}
	}
}
