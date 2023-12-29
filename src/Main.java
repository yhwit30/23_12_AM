import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("== programm started ==");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.print("입력된 명령어>");
			String cmd = sc.nextLine().trim();
			
			if(cmd.length() == 0) {
				System.out.println("명령어를 입력하세요");
				continue;
			}
			
			if(cmd.equals("article write")) {
				int lastId = 1;
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				articles.add(new Article(lastId, title, content));
				
				System.out.printf("%d번 글이 생성되었습니다.\n", lastId);
				lastId++;
			} 
			
			
			
			if(cmd.equals("article list")) {
				
				System.out.println("번호  /  제목  /  내용");

				for(int i = 0; i < articles.size(); i++) {
					System.out.printf("%d  /  %s  /  %s\n", articles.get(i).getId(), articles.get(i).getTitle(), articles.get(i).getContent());
				}
				
				
				
			}
			else {
				System.out.println("사용할 수 없는 명령어입니다.");
			}
			
			
			
			
			
			
			

			if (cmd.equals("exit")) {
				break;
			}
		}

		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("== programm terminated ==");
		sc.close();
	}

}
