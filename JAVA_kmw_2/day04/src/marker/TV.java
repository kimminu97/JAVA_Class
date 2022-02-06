package marker;

public class TV {
	
	public void checkAni(Videos [] videos) {
		for (int i = 0; i < videos.length; i++) {
			if(videos[i] instanceof Ani) {
				System.out.println("애니메이션입니다.");
			}else {
				System.out.println("애니메이션이 아닙니다.");
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
