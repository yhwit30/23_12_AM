import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("== programm started ==");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		List<Article> articles = new ArrayList<>();
		int lastArticleId = 0;
		// 날짜 변수

		while (true) {
			System.out.print("입력된 명령어>");
			String cmd = sc.nextLine().trim();

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력하세요");
				continue;
			}
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article write")) {
				int id = lastArticleId + 1;
				// 날짜 변수도 객체에 넣고
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();

				articles.add(new Article(id, title, body));

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
				lastArticleId++;

			} else if (cmd.equals("article list")) {
				System.out.println("== 게시글 목록 ==");
				if (articles.size() == 0) {
					System.out.println("아무것도 없어");
				}

				System.out.println("번호  /  제목  ");

				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%4d  /  %s\n", article.getId(), article.getTitle());
				}

			} else if (cmd.startsWith("article detail")) {
				if (cmd.charAt(15) == '1') {
					if (articles.size() == 0) {
						System.out.printf("%d번 게시글은 없습니다.\n", 1);
					} else if(articles.size() > 0) {
						Article article = articles.get(0);
						System.out.println("번호 : " + article.getId());
						System.out.println("날짜 : 2023-12-12 12:12:12");
						System.out.println("제목 : " + article.getTitle());
						System.out.println("내용 : " + article.getbody());
					}
					

				}
				if (cmd.charAt(15) == '2') {
					if (articles.size() == 1) {
						System.out.printf("%d번 게시글은 없습니다.\n", 2);
					}else if(articles.size() > 0) {
						Article article = articles.get(1);
						System.out.println("번호 : " + article.getId());
						System.out.println("날짜 : ");
						System.out.println("제목 : " + article.getTitle());
						System.out.println("내용 : " + article.getbody());
					
					}
				}
			}

			else {
				System.out.println("사용할 수 없는 명령어입니다.");
			}

		}

		System.out.println();
		System.out.println("== programm terminated ==");
		sc.close();
	}

}
