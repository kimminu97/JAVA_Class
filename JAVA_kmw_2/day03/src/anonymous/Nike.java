package anonymous;

public class Nike {
	
	public void register(Shop form) {
		String[] products = form.getProducts();
		System.out.println("===========��ǰ ���==========");
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		if(form instanceof ShopAdapter) {
			System.out.println("���� ���� �����");
		}else {
			form.sell("Ƽ����");
		}
		
	}
}
