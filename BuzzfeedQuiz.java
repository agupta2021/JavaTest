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
		String fish = "Moses Oscar";
		String elephant = monkey;
		monkey = "heffalump";
		System.out.println(monkey + 5 + "fish" + 7 + 2 + 5.5 + elephant + "elephant");
		
		
		
		
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
		
		
		int custardCaramelApplesNumber = 0;
		int time = 6;
		
		
		while (time < 12) {
			custardCaramelApplesNumber += 5;
			time = time + 1;
		}
		
		for(time = 6; time < 12; time++) {
			custardCaramelApplesNumber = custardCaramelApplesNumber + 5;
		}
		
		
		
		
		
		////////////////////////
		
		
		
		int firstNumber = 1;
		int secondNumber = 1;
		int temp;
		while (secondNumber < 1000000) {
			temp = secondNumber;
			secondNumber += firstNumber;
			firstNumber = temp;
		}
		
		System.out.println(secondNumber);
		
		
		
		
		
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
		System.out.println(a ? "mouse" : "mice");
		
		
		
		
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
				this.leftEnc = leftEnc;
				new UpdateThread().start();
			}
			
			public void start() {
				this.running = true;
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
			
			public void stop() {
				this.running = false;
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
