public class CalcPi {
	public static void main(String [] args) { 
        int termsNum = Integer.parseInt(args[0]);
		double term = 1;
		double sum = 0;

		for(int i = 1; i <= termsNum; i ++){
			if(i % 2 == 1 ){
				sum = sum + 1.0 / term;
			}
			else{
				sum = sum + (-(1.0 /term));
			}
			term = term + 2;
		}

		double approxPi = sum * 4;
		
        System.out.println("pi according to java: " + Math.PI);
        System.out.println("pi, approximates:     " + approxPi);

	
	}
}
