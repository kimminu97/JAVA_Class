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
		//feeling.txt를 현재 경로에 생성하고,
		//아래의 4가지 데이터를 줄바꿈을 사용하여 각각 출력한다.
		//기쁨, 슬픔, 사랑, 행복
		//출력 후 데이터가 잘 출력되었는 지를 입력하여 콘솔에 출력한다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("feeling.txt"));
//		bw.write("기쁨\n");
//		bw.write("슬픔\n");
//		bw.write("사랑\n");
//		bw.write("행복\n");
//		bw.close();
//		
//		BufferedReader br = null;
//		try { br = new BufferedReader(new FileReader("feeling.txt"));
//			String line = null;
//			while((line = br.readLine()) != null){
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("해당경로에 파일이 없습니다.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				//예외 발생시키기
//				throw new RuntimeException(e);
//			}
//		}
//		
//		System.gc(); //JVM에 있는 가비지 컬렉터를 호출(일괄처리)
//		System.runFinalization(); //필요없는 할당된 필드를 바로 해제(개별처리)
		
		
		//슬픔을 재미로 변경
//		BufferedReader br = new BufferedReader(new FileReader(new File("feeling.txt")));
//		String line = null;
//		String temp = "";
//		
//		while((line = br.readLine()) != null) {
//			if(line.equals("슬픔")) {
//				temp += "재미\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		br.close();
//		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("feeling.txt")));
//		bw.write(temp);
//		bw.close();
		
		//사랑 삭제
		BufferedReader br = new BufferedReader(new FileReader(new File("feeling.txt")));
		String line = null;
		String temp = "";
		while((line = br.readLine()) != null) {
			if(line.equals("사랑")) {
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
