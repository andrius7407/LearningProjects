import java.util.InputMismatchException;
import java.util.Scanner;

class Validator {
	
	public static Scanner scanner = new Scanner(System.in);
	
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
	
	public static double ifInputIsCorrectAsDouble(String input, String text) {
		double correctNumber;
		try {
			correctNumber = Double.parseDouble(input);
		}catch(NumberFormatException e) {
			while(true) {
				System.out.println(text);
				try {
					correctNumber = scanner.nextDouble();
					break;
				}catch(InputMismatchException ex) {
					System.out.println(text);
					scanner.nextLine();
				}
			}
		}
		return correctNumber;
	}
	
	public static double getNotZero() {
		double notZero = 0;
		while(notZero == 0) {
			System.out.println("Type not 0");
			notZero = scanner.nextDouble();
		}
		return notZero;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		boolean check = ifArgsLenghtIsCorrect(args);

		if(check == true) {
			double first = ifInputIsCorrectAsDouble(args[0], "Repeat first number");
			double second = ifInputIsCorrectAsDouble(args[1], "Repeat second number");
			String sign = args[2];
			double result = calc.computeResult(first, second, sign);
			System.out.println(result);
		}else {
			System.out.println("wrong length");
			help();
		}
	}	
}