package Object;

class Article{
	int seq;		//�� ��ȣ
	String subject;	//�� ����
	String writer;	//�ۼ���
	/*
	 * �Ķ���Ͱ� �����ϴ� ������
	 * -> �Ķ���Ϳ� ���ؼ� ��������� ���� �ʱ�ȭ�Ѵ�.
	 */
	 
	public Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	public void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
}

public class Main03 {

	public static void main(String[] args) {
		Article article = new Article(1, "�ڹٿ��� ù��°", "�ڹ��л�");
		article.print();
		System.out.println("----------------");
		
		Article article2 = new Article(2, "�ڹٴ� ��ü���� ����Դϴ�.", "�ڹٰ���");
		article2.print();
	}

}
