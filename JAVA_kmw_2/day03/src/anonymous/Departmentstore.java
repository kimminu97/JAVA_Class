package anonymous;

public class Departmentstore {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		//�������
		//���ᳪ�� ���
		//sell()�� ������ �ʿ䰡 ����.
		//��ǰ ��ϸ� �����ϸ� �ȴ�.
		//���ᳪ�� ������� �����̶�� ���翡���� �ǸŹ���� �˻����� �ʰ� "���� ���� �����"�� ������ش�.
		jamsil.register(new ShopAdapter() {
			public String[] getProducts() {
				String[] products = {"Ƽ����", "�Ź�", "����"};
				return products;
			}
		});
		gangnam.register(new Shop() {
			
			@Override
			public void sell(String order) {
				String[] products = getProducts();
				for (int i = 0; i < products.length; i++) {
					if(products[i].equals(order)) {
						System.out.println(order + " �Ǹ� �Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getProducts() {
				String[] products = {"Ƽ����", "����", "�Ź�"};
				return products;
			}
		});
	}
}
