package marker;

public class TV {
	
	public void checkAni(Videos [] videos) {
		for (int i = 0; i < videos.length; i++) {
			if(videos[i] instanceof Ani) {
				System.out.println("�ִϸ��̼��Դϴ�.");
			}else {
				System.out.println("�ִϸ��̼��� �ƴմϴ�.");
			}
			
		}
	}

	public static void main(String[] args) {
		Videos[] videos = { 
				new Ddolbee(),
				new RunHaney(),
				new Titanic(),
				new Zzanggu()
		};
	}

}
