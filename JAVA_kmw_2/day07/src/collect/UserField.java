package collect;

import java.util.ArrayList;

public class UserField {
	// ȸ���� ������ ������ �ڷᱸ��
	ArrayList<User> users = new ArrayList<>();
	
	// ID �ߺ��˻�
	public User checkId(String id) {
		// ���� for��, ���� for��, forEach
		// for(�ڷ��� ������ : iterator){
		// 	������ ����
		//}
		User temp = null;
		for(User user : users) {
			if(user.getId().equals(id)) {
				temp = user;
			}
		}
		return temp;
	}
	
	//ȸ������
		public void join(User user) {
			user.setPw(encrypt(user.getPw()));
			users.add(user);
		}

		//�α���
		public boolean login(String id, String pw) {
			User user = checkId(id);
//			if(user != null && decrypt(user.getPw()).equals(pw)) { //�����
			if(user != null && user.getPw().equals(encrypt(pw))) { //�ܹ���
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
