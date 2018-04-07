import java.util.Random;
/*
Bascically this sort is base on the gap
start with big gap between two elements
and reduce the gap
*/
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] arrs = new int[30];

      System.out.println("Before Sorting");
      for(int i =0;i<30;i++){
          arrs[i] = new Random().nextInt(100)+2;
          System.out.print(arrs[i]+" ");
      }
      System.out.println();
      shellSort(arrs);

      System.out.println("After Sorting");
      for(int i = 0; i < arrs.length;i++){
          System.out.print(arrs[i] + " ");

      }
      System.out.println();
    }

    public static void shellSort(int [] arr){
        int len = arr.length;
        int inc = 1;
        while(inc < len/3) inc = 3*inc+1;
        while(inc >= 1){
          for(int i = inc;i<len;i++){
            for(int j = i;j>=inc;j-=inc){
              if(arr[j] < arr[j-inc]){
                arr[j]^=arr[j-inc];
                arr[j-inc]^=arr[j];
                arr[j]^=arr[j-inc];
              }
            }
          }
          inc/=3;
        }
    }
}
