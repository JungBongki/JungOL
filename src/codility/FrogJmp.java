package codility;

public class FrogJmp {
	public static void main(String[] args) {

		int X = 10;
		int Y = 85;
		int D = 30;
		
		int count = (Y-X)/D;
		int mod_D = (Y-X)%D;
		if(mod_D != 0){
			count++;
		}
		System.out.println(count + " " + mod_D);
	}
	/*public static void main(String[] args) {

		int X = 0;
		int Y = 85;
		int D = 10;
		int count = 0;
		if(X<Y){
			count = jumping(X,Y,D,count);
		}
		System.out.println(count);
	}

	private static int jumping(int x, int y, int d, int count) {
		x += d;
		count++;
		return x >= y ? count : jumping(x,y,d,count);
	}*/
}
