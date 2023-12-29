import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("== programm start ==");
		Scanner sc = new Scanner(System.in);

		String cmd = sc.next();
		cmd = sc.next();
		System.out.println("입력된 명령어 : " + cmd);
		
		int cmd2 = sc.nextInt();
		System.out.println("입력된 정수 : " + cmd2);
		
		
		
		
		
		
		System.out.println("== programm end ==");
		sc.close();
	}

}
