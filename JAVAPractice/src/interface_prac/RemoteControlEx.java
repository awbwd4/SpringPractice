
package interface_prac;

import class_practice.Tv;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		
		Television tv = new Television();
		//이런다고 인터페이스를 쓰는건 아님
		
		
		
		//인터페이스를 쓰려면 이렇게 
		RemoteControl rc = null;
		
		rc = new Television();//구현객체를 인터페이스 변수에 대입해서 사용한다.
		rc.turnOn();
		rc.turnOff(); //인터페이스 타입의 변수 rc로 메소드 호출 가능->구현 메소드가 자동 실행된다. 
		
		rc.setMute(true);	
		//구현 객체에는 없는 디폴트 메소드이지만, 구현 객체가 생성되어있지 않다면 쓸 수 없다. 
		
		Television tv2 = (Television) rc;
		tv2.setTime();
		rc.setMute(true);
		
		//RemoteControl rc2 = new Audio();
		
		
		if (rc2 instanceof Television) {
			Television tv3 = (Television) rc2;
			
		}else {
			System.out.println("아님아님");
		}
		
		
		
		RemoteControl.changeBattery();//구현객체 생성이 안돼있어도 static 메소드이므로 바로 호출 가능.
		
		
		
		
		//인터페이스 익명 구현객체.
		RemoteControl rc3 = new RemoteControl() {
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}









interface Searchable{
		void search(String url);
}



interface RemoteControl{
	
	//상수
		public int MAX_VOLUME = 10;
		public int MIN_VOLUME = 0;
		
		//추상 메소드
		public abstract void turnOn();
		public void turnOff();//abstact를 명시하지 않아도 컴파일 과정에서 자동으로 붙게 됨.
		public void setVolume(int volume);

		//디폴트 메소드 : 따로 public을 명시하지 않아도 public 타입임.
		//디폴트 메소드는 실행내용까지 작성함.
		//인터페이스에 선언은 되지만 인스턴스가 갖고있는 멤버 메소드와 동일한 기능을 수행.
		default void setMute(boolean mute) {
			if (mute) {
				System.out.println("음소거");
			} else {
				System.out.println("음소거 해제");
			}
		}
		
		//정적 메소드 - 인터페이스만으로 호출 가능.
		static void changeBattery() {
			System.out.println("건전지 교체");
		}
	
}








class Television implements RemoteControl, Searchable{

	//필드
	private int volume;
	
	
	
	@Override
	public void turnOn() {//인터페이스의 모든 메소드는 기본적으로 public이기 때문에, 구현 메소드는 public보다 낮은 접근 제한자를 가질 수 없다.
		System.out.println("tv킴");
	}

	@Override
	public void turnOff() {
		System.out.println("tv끔");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {//인터페이스 구현 클레스에서는 인터페이스의 상수를 이런식으로 사용함.
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		
		System.out.println("현재 tv볼륨:" + volume);
		
		
	}

	@Override
	public void search(String url) {
		System.out.println(url+" 검색");
	}
	
	
	public void setTime() {
		System.out.println("희희");
	}

	
	@Override
	public void setMute(boolean mute) {
	System.out.println("디폴트 메서드 오버라이딩 흐히흐히");
	}
	
}


abstract class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	

	public abstract void setMute(boolean mute);
	
	
}


