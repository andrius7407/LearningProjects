class Calculator {
	
	Validator val = new Validator();
	
	public double computeResult(double first, double second, String sign) {
		double result = 0;
			switch(sign) {
				case "+":
					result = addition(first, second);
					break;
				case "-":
					result = subtraction(first, second);
					break;
				case "*":
					result = multiplication(first, second);
					break;
				case "/":
					result = division(first, second);
					break;
				default:
					System.out.println("wrong sign");
					val.help();
			}
		return result;
	}
	
	public double addition(double first, double second) {
		double result = first + second;
		return result;
	}
	
	public double subtraction(double first, double second) {
		double result = first - second;
		return result;
	}
	
	public double multiplication(double first, double second) {
		double result = first * second;
		return result;
	}
	
	public double division(double first, double second) {
		if(second == 0) {
			second = val.getNotZero();
		}
		double result = first / second;
		return result;
	}
}