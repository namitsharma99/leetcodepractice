class Problem65ValidNumber {

    public boolean isNumber(String s) {
        
        boolean isDigit = false, isExponential = false, isDot = false;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                isDigit = true;
            } else if (c == '+' || c == '-') {
                if (i > 0) {
                    if (s.charAt(i-1) != 'E'  && s.charAt(i-1) != 'e') {
                        return false;
                    }
                }
            } else if (c == 'E' || c == 'e') {
                if (isExponential || !isDigit) {
                    return false;
                }
                isExponential = true;
                isDigit = false;
            } else if (c == '.') {
                if (isDot || isExponential) {
                    return false;
                }
                isDot = true;
            } else {
                return false;
            }
        }
        return isDigit;
    }
}
