import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int[][] arr = {{20,10,12,34,55,69},
                      {12,18,19,45},
                      {8,3,6,9,10}
    };
        int target = 19;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
                    
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
