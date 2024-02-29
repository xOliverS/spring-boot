package util;



public class NumberConverter {
	
	public static Double convertToDouble(String strNumber) {
		/*try {
            return Double.parseDouble(strNumber);
        } catch (NumberFormatException e) {
            return null;
        }*/ 
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		/*try {
            Double.parseDouble(strNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }*/
    }

}
