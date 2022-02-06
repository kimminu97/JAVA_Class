package collect;

public class Page {
	public static void main(String[] args) {
		UserField uf = new UserField();
		User user = new User();
		
		user.setId("kmw1234");
		user.setName("김민우");
		user.setPw("1234");
		
		if(uf.checkId(user.getId()) == null) {
			uf.join(user);
			System.out.println(uf.users);
		}
		
		if(uf.login("kmw1234", "1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}

