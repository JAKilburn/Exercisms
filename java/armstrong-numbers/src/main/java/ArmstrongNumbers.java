class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String stringNum = "" + numberToCheck;
		int check = 0;
		for(int i = 0; i < stringNum.length(); i++){
			check += Math.pow(Character.getNumericValue(stringNum.charAt(i)), stringNum.length());
		}
		System.out.println("This is the sum: " + check);
		if(check == numberToCheck){
			return true;
		} else return false;
	}

}
