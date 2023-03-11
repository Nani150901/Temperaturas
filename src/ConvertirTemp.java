
public class ConvertirTemp {
	public double convTemC(double tempRegistrada) {
		tempRegistrada=(tempRegistrada-32)*5/9;//C A F
		tempRegistrada=(tempRegistrada)* 9/5 + 491.67;//C A R
		tempRegistrada=tempRegistrada+273.15;//C A KELVIN
		return tempRegistrada;
	}
	public double convTemF(double tempRegistrada) {
		tempRegistrada=(tempRegistrada-32)*5/9;//C A F
		tempRegistrada=(tempRegistrada)* 9/5 + 491.67;//C A R
		tempRegistrada=tempRegistrada+273.15;//C A KELVIN
		return tempRegistrada;
	}
	public double convTemR(double tempRegistrada) {
		tempRegistrada=(tempRegistrada-32)*5/9;//C A F
		tempRegistrada=(tempRegistrada)* 9/5 + 491.67;//C A R
		tempRegistrada=tempRegistrada+273.15;//C A KELVIN
		return tempRegistrada;
	}
	public double convTemK(double tempRegistrada) {
		tempRegistrada=(tempRegistrada-32)*5/9;//C A F
		tempRegistrada=(tempRegistrada)* 9/5 + 491.67;//C A R
		tempRegistrada=tempRegistrada+273.15;//C A KELVIN
		return tempRegistrada;
	}
}
