import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConvertirTemp {
	static double temp;
	static String format="0.000";
	static NumberFormat formatter =new DecimalFormat(format);
	public static String convTemCAF(String tempRegistrada) {
		temp=  Double.valueOf(tempRegistrada);
		tempRegistrada=""+ formatter.format((temp*9/5)+32);//C A F
		return tempRegistrada;
	}
	public static String convTemCAK(String tempRegistrada) {
		temp=Double.valueOf(tempRegistrada)+273.15;//C A KELVIN
		return ""+formatter.format(temp);
	}
	public static String convTemCAR(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada))* 9/5 + 491.67;//C A R
		return ""+formatter.format(temp);
	}
	public static String convTemRAK(String tempRegistrada) {
		temp=Double.valueOf(tempRegistrada)* 5/9;//R A KELVIN
		return ""+formatter.format(temp);
	}
	public static String convTemRAC(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada)-491.67)* 5/9;//C A R
		return ""+formatter.format(temp);
	}
	public static String convTemRAF(String tempRegistrada) {
		temp= Double.valueOf(tempRegistrada);
		tempRegistrada=""+formatter.format(temp-459.67);//R A F
		return tempRegistrada;
	}
	public static String convTemKAF(String tempRegistrada) {
		temp= Double.valueOf(tempRegistrada);
		tempRegistrada=""+formatter.format((temp-273.15)* 9/5 + 32);//K A F
		return tempRegistrada;
	}
	public static String convTemFAC(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada)-32)* 5/9;//C A KELVIN
		return ""+formatter.format(temp);
	}
	public static String convTemKAR(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada)*9/5);//K A R
		return ""+formatter.format(temp);
	}
	public static String convTemFAK(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada)-32)* 5/9 +273.15;//C A KELVIN
		return ""+formatter.format(temp);
	}
	public static String convTemKAC(String tempRegistrada) {
		temp=(Double.valueOf(tempRegistrada))-273.15;//C A R
		return ""+formatter.format(temp);
	}
	public static String convTemFAR(String tempRegistrada) {
		temp= Double.valueOf(tempRegistrada);
		tempRegistrada=""+formatter.format(temp+459.67);//C A F
		return tempRegistrada;
	}
}
