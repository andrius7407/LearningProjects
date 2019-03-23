import java.util.Scanner;

class Validator {
	
	public static void help() {
		String helpMessage = "Naudojimo instrukcija:" +
		"\niveskite skaicius skaicius zenklas(+, -, *, /,)." +
		"\nZenkla * iveskite kabutese.\nDalyba is nulio - negalima.";
		System.out.println(helpMessage);
	}
	
	public static boolean ifArgsLenghtIsCorrect(String[] args) {
		boolean check = (args.length == 3);
		System.out.println(check);
		return check;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		boolean check = ifArgsLenghtIsCorrect(args);

		if(check == true) {
			double first = Double.parseDouble(args[0]);
			double second = Double.parseDouble(args[1]);
			String sign = args[2];
			double result = calc.computeResult(first, second, sign);
			System.out.println(result);
		}else {
			System.out.println("wrong length");
			help();
		}
	}	
}