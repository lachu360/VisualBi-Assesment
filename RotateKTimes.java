import java.util.*;
public class RotateKTimes {
    
    public static void reverse(int low, int high,int[] arr){
        int temp;
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return;
    }
    
    public static void rotateK(int[] arr,int k){
        reverse(arr.length-k,arr.length-1,arr);
        reverse(0,arr.length-k-1,arr);
        reverse(0,arr.length-1,arr);
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int[] arr = new int[n];
      
      for(int i = 0;i < n;i++){
          arr[i] = sc.nextInt();
      }
      
      rotateK(arr,k);
      
      for(int i = 0;i < n;i++){
          System.out.print(arr[i]+" ");
      }
      
    }
}