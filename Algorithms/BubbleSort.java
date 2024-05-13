public class BubbleSort{

    static void swap(int arr[], int index){
        int value1 = arr[index];
        int value2 = arr[index + 1];
        arr[index] = value2;
        arr[index + 1] = value1;
    } 

    static void sort(int arr[]){
        int n = arr.length;

        for(int k = 1; k < n; k++){
            int flag = 0;
            for(int i = 0; i < n - k; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i);
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

    public static void main(String[] args){
        final int[] numbers = {2, 7, 89, 9, 3, 300, 1, 5, 1010};
        
        sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", " );
        }

    }
    
}