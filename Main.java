import java.util.Random;
import static java.lang.Math.*;
public class Main{
	public static void main(String[] args){
		short c [] = new short[7];
		for(short i=6; i<19;i+=2) c[(i-6)/2] = i;
		Random r = new Random();
		Double xMas [] = new Double[18];
		for(int i=0; i<18;i++) xMas[i] = r.nextDouble(-10.0, 8.0);
		double mas [][] = new double[7][18];
		for(int i = 0; i<7; i++){
			for(int j = 0; j<18; j++){
				double x = xMas[j];
				switch(c[i]){
					case(10):
						mas[i][j] = log(pow(2*pow(sin(x), 2), 2));
						break;
					case(12):
					case(16):
					case(18):
						mas[i][j] = tan(pow(E, atan((x-1)/18)));
						break;
					default:
						mas[i][j] = tan(pow(cos(0.5/x),2));
	
				}
			
			}
		}
		for(double [] mass: mas){
			for(double value: mass){
				System.out.print(String.format("%10.5f", value));
			}
		System.out.println();
		}

	}
}
