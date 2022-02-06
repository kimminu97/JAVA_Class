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
			
			//이전 순위가 있다면
			if(ranking != 0) {
				//현재 순위 - 이전 순위가 1이 아닐 때(순위에 문제가 있을 때)
				if(recent - ranking != 1) {
					//FLAG로 체크
					check = true;
				}
			}
			
			//순위에 문제가 있다면 이전 순위 +1로 현재 순위를 변경한다.
			if(check) {
				//이전 순위가 현재 순위랑 1차이가 나지 않는다면 현재 순위 수정
				//아직 파일에 있는 순위는 변경시키지 않았기 때문에(temp만 변경)
				//ranking에 recent를 넣어주면 변경 전 순위로 인식되어서 버그 발생
				temp += line.split("\t")[0] + "\t" + ++ranking + line.substring(line.lastIndexOf("\t")) + "\n";
			}else {
				//이전순위에 현재 순위를 담아서 다음 반복을 준비한다.
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
