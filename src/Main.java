public class Main {

    public static int sNumber(int [] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int currentNumber: arr){

            if(largest == Integer.MIN_VALUE)
                largest= currentNumber;
            else if(currentNumber>largest){
                secondLargest=largest;
                largest=currentNumber;
            }else if(secondLargest==Integer.MIN_VALUE){
                secondLargest = currentNumber;
            }else if(currentNumber>secondLargest){
                secondLargest=currentNumber;
            }
        }
        return secondLargest;
    }

    public static void main(String args[])
    {
    int[] a = {4,2,6,3,5,0};
        sNumber(a);
    }
}