public class Collatz {
	public static void main(String args[]) {
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		int seednum = 0;
		int seed = 1;
		int count = 1;
		String v = "v";

		// מטפלים בסדרה הראשונה שמתחילה ב 1
		while(seednum != 1){
			if(mode.equals(v) ){
				System.out.print(seed + " ");
			}
			if (seed % 2 == 0) {
				seed = seed / 2;
			} 
			else{
				seed = 1 + (seed *3);
			}
			seednum = seed;
			count++;
		} 
		if(mode.equals(v) ){
			System.out.print(seed);
		}
		if(mode.equals(v) ){
			System.out.println(" (" + count + ")");
		}
		//איפוס המשתנים בשביל שימוש נוסף לשאר הסדרות מגדילים את הסיד באחד כדי להתחיל מהסדרה השנייה
		seed = 2;
		count = 1;
		int x = 2;

		// טיפול בשאר הסדרות הגדולות מאחד במידה וקיימות
		while(seed <= highestSeed){
			while(x != 1){
			if(mode.equals(v)){
				System.out.print(x + " ");
			}
				if(x % 2 == 0 ){
					x = x / 2;
				}
				else{
					x = 1 + (x * 3);
				}
				count++;
			}
			if(mode.equals(v) ){
				System.out.print(x);
			}
			if(mode.equals(v) ){
				System.out.println(" (" + count + ")");
			}
			seed++;
			x = seed;
			count = 1;
		}
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1." );

	}
}
