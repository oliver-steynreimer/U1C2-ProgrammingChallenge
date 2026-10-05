public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + .5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if(roundedAverage >= 65){
            return true;
        } else {
        return false;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares * price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if(totalStock >= 0){
            totalStock += .5;
            return (int) totalStock;
        } else {
            totalStock -= .5;
            return (int) totalStock;
        }
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        userDouble *= 100;
        int hundreths = (int) (userDouble % 10);
        int tenths = ( (int) (userDouble % 100) / 10);
        int ones = ( (int) (userDouble % 1000)/ 100);
        int tens = ( (int) (userDouble % 10000) / 1000);
        int hundreds = ( (int) (userDouble % 100000) / 10000);

        hundreths ++;
        if(hundreths > 9){
            hundreths = 0;
        }

        tenths ++;
        if(tenths > 9){
            tenths = 0;
        }

        ones ++;
        if(ones > 9){
            ones = 0;
        }

        tens ++;
        if(tens > 9){
            tens = 0;
        }

        hundreds ++;
        if(hundreds > 9){
            hundreds = 0;
        }

        double hundrethsFinal = hundreths / 100.0;
        double tenthsFinal =  tenths / 10.0;
        double tensFinal = tens * 10.0;
        double hundredsFinal = hundreds * 100.0;

        double last = hundrethsFinal + tenthsFinal + ones + tensFinal + hundredsFinal;



        return last;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
