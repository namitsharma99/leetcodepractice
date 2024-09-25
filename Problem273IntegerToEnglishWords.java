class Problem273IntegerToEnglishWords {
        
        // Given 0 <= num <= 2,147,483,648

        String [] digitsUnder20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String [] tensDigitsAbove20 = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String [] thousands = { "", "Thousand", "Million", "Billion" };

    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";
        
        String output = "";

        int thousands_counter = 0;

        while (num > 0) {

            int remainder = num % 1000;

            if (remainder != 0) {
                output = translate(remainder) + thousands[thousands_counter] + " " + output;
            }

            num = num / 1000;
            thousands_counter++;
        }


        return output.trim();

    }

    private String translate (int n) {
        if (n == 0) 
            return "";

        if (n <= 19) {
            return digitsUnder20[n] + " ";
        } else if (n <= 99) {
            return tensDigitsAbove20[n/10] + " " + translate (n%10);
        } else {
            return digitsUnder20[n/100] + " Hundred " + translate(n%100);
        }
    }
}
