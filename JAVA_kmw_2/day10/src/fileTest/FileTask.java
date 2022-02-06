package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		//feeling.txt�� ���� ��ο� �����ϰ�,
		//�Ʒ��� 4���� �����͸� �ٹٲ��� ����Ͽ� ���� ����Ѵ�.
		//���, ����, ���, �ູ
		//��� �� �����Ͱ� �� ��µǾ��� ���� �Է��Ͽ� �ֿܼ� ����Ѵ�.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("feeling.txt"));
//		bw.write("���\n");
//		bw.write("����\n");
//		bw.write("���\n");
//		bw.write("�ູ\n");
//		bw.close();
//		
//		BufferedReader br = null;
//		try { br = new BufferedReader(new FileReader("feeling.txt"));
//			String line = null;
//			while((line = br.readLine()) != null){
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�ش��ο� ������ �����ϴ�.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				//���� �߻���Ű��
//				throw new RuntimeException(e);
//			}
//		}
//		
//		System.gc(); //JVM�� �ִ� ������ �÷��͸� ȣ��(�ϰ�ó��)
//		System.runFinalization(); //�ʿ���� �Ҵ�� �ʵ带 �ٷ� ����(����ó��)
		
		
		//������ ��̷� ����
//		BufferedReader br = new BufferedReader(new FileReader(new File("feeling.txt")));
//		String line = null;
//		String temp = "";
//		
//		while((line = br.readLine()) != null) {
//			if(line.equals("����")) {
//				temp += "���\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		br.close();
//		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("feeling.txt")));
//		bw.write(temp);
//		bw.close();
		
		//��� ����
		BufferedReader br = new BufferedReader(new FileReader(new File("feeling.txt")));
		String line = null;
		String temp = "";
		while((line = br.readLine()) != null) {
			if(line.equals("���")) {
				continue;
			}
			temp += line + "\n";
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("feeling.txt")));
		bw.write(temp);
		bw.close();
	}
}
