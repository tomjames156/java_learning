public class BinarySearch{

    static int find(int num, int[] arr){
        // low = 0
        // high = arr.length - 1
        int low = 0;
        int high = arr.length - 1;

        // WHILE low <= high DO
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(arr[mid] == num){
                System.out.println("Found " + arr[mid] + " at index " + mid);
                return num;
            }else if(num < arr[mid]){
                high = mid - 1;
            }else if(num > arr[mid]){
                low = mid + 1;
            }
        }

        // System.out.println("Not Found");
        // return -1;
            // mid = (low + high) / 2
            // check if num at mid == num
            // RETURN num
            // IF num < mid THEN
            // high = mid -1
            // ELSE IF num > mid THEN
            // low = mid + 1
            // ENDIF
        // END WHILE
        // PRINT "NOT FOUND"
        // RETURN -1

        System.out.println("Not Found");
        return num;
    }

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 6, 7, 8};
        find(0, numbers);
    }
}