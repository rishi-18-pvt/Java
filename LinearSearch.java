public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {11,12,8,9,0,7,1};
        int target = 9;
        System.out.println(LinearSearch(arr, target));
    }
    static int LinearSearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}


