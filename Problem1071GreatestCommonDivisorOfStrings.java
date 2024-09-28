class Problem1071GreatestCommonDivisorOfStrings {
    
    public String gcdOfStrings(String str1, String str2) {
        
        String remainder = "";

        if ( !(str1+str2).equals(str2+str1)  ) {
            return remainder;
        }

        int index = findGcd(str1.length(), str2.length());
        return str1.substring(0,index);

    }
   


     private int findGcd (int l1, int l2) {
        if (l2 == 0)
            return l1;
        else 
            return findGcd (l2, l1%l2);
            
     }
}
