package view;

import dao.TBL_MEMBER_DAO;
import vo.TBL_MEMBER_VO;

public class User {
	public static void main(String[] args) {
		TBL_MEMBER_DAO dao = new TBL_MEMBER_DAO();
		
//		if(dao.login("kmw1234", "1234")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
//		if(dao.checkId("kmw1234")) {
//			System.out.println("사용가능한 아이디");
//		}else {
//			System.out.println("중복된 아이디");
//		}
		TBL_MEMBER_VO vo = new TBL_MEMBER_VO();
		vo.setId("kmw1111");
		vo.setPw("5555");
		vo.setName("김민우");
		vo.setAge(20);
		
		if(dao.join(vo)) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
	}
}
