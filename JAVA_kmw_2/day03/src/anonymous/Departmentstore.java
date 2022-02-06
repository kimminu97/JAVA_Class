package anonymous;

public class Departmentstore {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		//잠실지점
		//무료나눔 행사
		//sell()을 구현할 필요가 없다.
		//상품 목록만 구현하면 된다.
		//무료나눔 행사중인 지점이라면 본사에서는 판매방식을 검사하지 않고 "무료 나눔 행사중"을 출력해준다.
		jamsil.register(new ShopAdapter() {
			public String[] getProducts() {
				String[] products = {"티셔츠", "신발", "가방"};
				return products;
			}
		});
		gangnam.register(new Shop() {
			
			@Override
			public void sell(String order) {
				String[] products = getProducts();
				for (int i = 0; i < products.length; i++) {
					if(products[i].equals(order)) {
						System.out.println(order + " 판매 완료");
					}
				}
			}
			
			@Override
			public String[] getProducts() {
				String[] products = {"티셔츠", "바지", "신발"};
				return products;
			}
		});
	}
}
