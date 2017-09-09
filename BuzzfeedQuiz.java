import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BuzzfeedQuiz {
	public static void main(String[] args) {
		int x = 5; 
		if (x % 2 == 1) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
		
		
		
		///////////////////////
		
		
		
		String monkey = "horseradish";
		String fish = "moses oscar";
		String elephant = monkey;
		monkey = "heffalump";
		System.out.println(monkey + 5 + "fish" + 7 + 2.5 + elephant + "elephant");
		
		
		
		
		////////////////////////
		
		
		
		
		
		double c = 715.4;
		String m = "thing";
		if (c > 0 && m.equals("thing")) {
			System.out.println("ole");
		} else if (c > 15) {
			System.out.println("apples"); 
		} else if (c > -1 || c < -15) {
			System.out.println("hedwig");
		} else if (c == -10) {
			System.out.println("this is a sentence");
		}
	
		String s = "th";
		
		if (s + "ing" == "thing") {
			System.out.println("custard");
		}
		
		
		
		
		//////////////////////////
		
		
		int number = 0;
		int time = 6;
		
		
		while (time < 12) {
			number += 5;
			time = time + 1;
		}
		
		for(time = 6; time < 12; time++) {
			number = number + 5;
		}
		
		
		
		
		
		////////////////////////
		
		
		
		int var1 = 1;
		int var2 = 1;
		int temp;
		while (var2 < 1000000) {
			temp = var2;
			var2 += var1;
			var1 = temp;
		}
		
		System.out.println(var2);
		
		
		
		
		
		/////////////////////////
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + ", " + j);
				if (i == 0 && j == 0) {
					break;
				}
			}
		}
		
		
		
		//////////////////////////
		
		
		int[] numbers = new int [20];
		String[] apples = {"flowers", "mouse", "octopus", "cheesecake", "snake"};
		
		for(int i = apples.length; i > 0; i--) {
			System.out.println(apples[i]);
		}
		
		numbers[0] = 4; 
		for(int i = 1; i < numbers.length; i++) {
			numbers[i] = (int)(numbers[i-1] * 1.5);
		}
		
		
		
		////////////////////////
		
		
		boolean a = true;
		System.out.println(a ? "mouse" : "super mouse");
		
		
		
		
		//////////////////////
		
		
		int jester = 21;
		while (jester > 0) {
			System.out.println(jester);
			jester /= 2;
		}
		
		
		
	   //////////////////////////
		 
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			if(i % 3 == 0) {
				arr.add(i);
			}
		}
		System.out.println(arr.size());
		
		
		
		////////////////////////
		
		
		
		public class DeadReckoning {
			
			private double x, y;
			private double lastDist;
			private boolean running;
			private AHRS gyro; 
			private Encoder leftEnc, rightEnc;
			
			public DeadReckoning(AHRS gyro, Encoder leftEnc, Encoder rightEnc) {
				this.gyro = gyro;
				this.rightEnc = rightEnc;
				this.leftEnc = leftEnc;			}
			
			public void start() {
				zero();
			}
			
			public synchronized void zero() {
				x = 0;
				y = 0;
				gyro.reset();
				leftEnc.reset();
				rightEnc.reset();
				lastDist = 0;
			}
			
			public double getX() {
				return x;
			}
			
			public double getY() {
				return y;
			}
			
			private synchronized void update() {
				double curDist = (leftEnc.getDistance() + rightEnc.getDistance()) / 2;
				double deltaDist = curDist - lastDist;
				double angle = gyro.getAngle();
				
				x += deltaDist * Math.sin(Math.toRadians(angle));
				y += deltaDist * Math.cos(Math.toRadians(angle));
				
				lastDist = curDist;
			}
		}

		
	}
}
