package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//throws(���� ������)
	//�ش� �޼ҵ� ������ �ݺ������� ������ ���� �߻� ��
	//�޼ҵ� ��� �κ����� �ش� ���ܸ� ����(������)���ش�.
	public static void main(String[] args) throws IOException {
		//���� ��� : ��𼭵��� ã�ư� �� �ִ� ���
		//��� ��� : ���� ��ġ�� ���� ���� ����� �� �ִ� ���
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.txt"),true));
//		bw.write("��ο�");
//		//\n
//		bw.newLine();
//		// close �޼ҵ尡 �÷����� �����Ͽ� ���۸� ���
//		bw.close();
		
		BufferedReader br = null;
		try {
			br =  new BufferedReader(new FileReader(new File("test.txt")));
			String line = null;
			//readLine(); //���� �������� , �� �̻� ������ ���� ������ null
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ��ο� ������ �����ϴ�.");
		}
		
		
	}
}
