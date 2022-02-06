package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//throws(예외 던지기)
	//해당 메소드 내에서 반복적으로 동일한 예외 발생 시
	//메소드 사용 부분으로 해당 예외를 전달(던지기)해준다.
	public static void main(String[] args) throws IOException {
		//절대 경로 : 어디서든지 찾아갈 수 있는 경로
		//상대 결로 : 현재 위치한 곳에 따라서 변경될 수 있는 경로
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.txt"),true));
//		bw.write("김민우");
//		//\n
//		bw.newLine();
//		// close 메소드가 플러쉬도 수행하여 버퍼를 비움
//		bw.close();
		
		BufferedReader br = null;
		try {
			br =  new BufferedReader(new FileReader(new File("test.txt")));
			String line = null;
			//readLine(); //한줄 가져오기 , 더 이상 가져올 값이 없으면 null
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
		} catch(FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
		
		
	}
}
