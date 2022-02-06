package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Names {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("names.txt"));
		String line = null;
		String temp = "";
		
		int ranking = 0;
		boolean check = false;
		
		while((line = br.readLine()) != null) {
			check = false;
			int recent = Integer.parseInt(line.split("\t")[1]);
			
			//���� ������ �ִٸ�
			if(ranking != 0) {
				//���� ���� - ���� ������ 1�� �ƴ� ��(������ ������ ���� ��)
				if(recent - ranking != 1) {
					//FLAG�� üũ
					check = true;
				}
			}
			
			//������ ������ �ִٸ� ���� ���� +1�� ���� ������ �����Ѵ�.
			if(check) {
				//���� ������ ���� ������ 1���̰� ���� �ʴ´ٸ� ���� ���� ����
				//���� ���Ͽ� �ִ� ������ �����Ű�� �ʾұ� ������(temp�� ����)
				//ranking�� recent�� �־��ָ� ���� �� ������ �νĵǾ ���� �߻�
				temp += line.split("\t")[0] + "\t" + ++ranking + line.substring(line.lastIndexOf("\t")) + "\n";
			}else {
				//���������� ���� ������ ��Ƽ� ���� �ݺ��� �غ��Ѵ�.
				temp += line + "\n";
				ranking = recent;
			}
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt"));
		bw.write(temp);
		bw.close();
	}
}
