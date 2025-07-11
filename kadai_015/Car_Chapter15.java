package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 0;   //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter15() {
		this.gear = gear;
		this.speed = speed;
		
		System.out.println("現在のギアは" + this.gear);
		System.out.println("現在の速度は時速" + this.speed + "km");
	}

	//メゾット
	//ギアの値により速度を変えるメゾット
	public void gearChange(int afterGear) {
		
		if((1> afterGear)||( afterGear > 5)) {
			System.out.println("ギアの最大値は5です" );
			return;
		}
		System.out.println("ギアを" + this.gear +"から" + afterGear + "に切り替えました");
		
		if(afterGear == 1) {
			this.speed = 10;
		}
		else if (afterGear == 2) {
			this.speed = 20;
		}
		else if (afterGear == 3) {
			this.speed = 30;
		}
		else if (afterGear == 4) {
			this.speed = 40;
		}
		else if (afterGear == 5) {
			this.speed = 50;
		}
		else {
			this.speed = 10;
		}
		
		this.gear =afterGear;
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" +this.speed + "kmです" );
	}
}
