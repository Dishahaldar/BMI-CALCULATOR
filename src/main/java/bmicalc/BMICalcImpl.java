package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		return mass/(height*height);
	}

	public String category(double bmi) {
	 if(bmi<18.5){return "UNDERWEIGHT";}
	 else if(bmi>18.5 && bmi<24.9) {return "NORMAL";}
	 else if(bmi>25.9 && bmi<29.9) {return "OVERWEIGHT";}
	 else if(bmi>29.9 && bmi<34.9) {return "OBESE";}
	 else {return "EXTREMELY OBESE";} 
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
