package collect;

import java.util.ArrayList;

public class UserField {
	// 회원의 정보를 저장할 자료구조
	ArrayList<User> users = new ArrayList<>();
	
	// ID 중복검사
	public User checkId(String id) {
		// 빠른 for문, 향상된 for문, forEach
		// for(자료형 변수명 : iterator){
		// 	실행할 문장
		//}
		User temp = null;
		for(User user : users) {
			if(user.getId().equals(id)) {
				temp = user;
			}
		}
		return temp;
	}
	
	//회원가입
		public void join(User user) {
			user.setPw(encrypt(user.getPw()));
			users.add(user);
		}

		//로그인
		public boolean login(String id, String pw) {
			User user = checkId(id);
//			if(user != null && decrypt(user.getPw()).equals(pw)) { //양방향
			if(user != null && user.getPw().equals(encrypt(pw))) { //단방향
				return true;
			}
			return false;
		}

		public String encrypt(String pw) {
			String en_pw = "";
			for (int i = 0; i < pw.length(); i++) {
				en_pw += (char)(pw.charAt(i) * 3);
			}
			return en_pw;
		}
		public String decrypt(String pw) {
			String en_pw = "";
			for (int i = 0; i < pw.length(); i++) {
				en_pw += (char)(pw.charAt(i) / 3);
			}
			return en_pw;
		}

}
