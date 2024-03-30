class ArmstrongNumbers {
    
    boolean isArmstrongNumber(int numberToCheck) {
        String numAsString = Integer.toString(numberToCheck);
        int exponent = numAsString.length();
        int sum = 0;

        for (int i = 0; i < numAsString.length(); i ++) {
            char currentChar = numAsString.charAt(i);
            int digit = Character.getNumericValue(currentChar);
            sum += Math.pow(digit, exponent);
        }

        return numberToCheck == sum;
    }
}
