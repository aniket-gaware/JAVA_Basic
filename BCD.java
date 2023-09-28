
public class BCD{
    public static void main( String args[]){
        binNum(101);
    
    }

    public static void binToDec ( int binToDec){
        int pow=0;
        int decNum=0;

        while (binNum > 0){
            int lastdigit = binNum % 10;

            decNum = decNum + (lastdigit* (int)math.pow(2, pow));

            pow++;
            binNum = binNum % 10;

        }

        System.out.println("Decimal of binary number is :"+decNum);
    }
}