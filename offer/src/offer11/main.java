package offer11;

public class main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,2,2,0,1};
        System.out.println(numbers);
        int low = 0;
        int high = numbers.length - 1;

        while(low < high){
            int mid = low + (high - low)/2;
            if( numbers[mid] < numbers[high]){
                high = mid;
            }else if(numbers[mid] > numbers[high]){
                low = mid+1 ;
            }else{
                high--;
            }
        }

        System.out.println(numbers[low]);


    }

}

