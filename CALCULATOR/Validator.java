import java.util.Scanner;

class Validator {
	
	public static String help() {
		String helpMessage = "Naudojimo instrukcija:" +
		"\niveskite skaicius skaicius zenklas(+, -, *, /,)." +
		"\nZenkla * iveskite kabutese.\nDalyba is nulio - negalima.";
		return helpMessage;
	}
	
	public static String[] getCorrectData(String[] args) {
		String[] correctData = new String[3];
		
		if(args.length == 3) {
			
			for(int i = 0; i < args.length; i++){
				correctData[i] = args[i];
			}
			
		}else{
			System.out.println(help());
		}
		return correctData;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String[] correctData = getCorrectData(args);
		//double first = getCorrectNumber(correctData[0], );
		double first = Double.parseDouble(correctData[0]);
		double second = Double.parseDouble(correctData[1]);
		String sign = correctData[2];
		double result = calc.computeResult(first, second, sign);
		System.out.println(result);
	}	
}
/*
if input empty, there is output:

e:\JAVA\LearningProjects\CALCULATOR>java Validator
Naudojimo instrukcija:
iveskite skaicius skaicius zenklas(+, -, *, /,).
Zenkla * iveskite kabutese.
Dalyba is nulio - negalima.
Exception in thread "main" java.lang.NullPointerException
        at sun.misc.FloatingDecimal.readJavaFormatString(Unknown Source)
        at sun.misc.FloatingDecimal.parseDouble(Unknown Source)
        at java.lang.Double.parseDouble(Unknown Source)
        at Validator.main(Validator.java:31)
*/		