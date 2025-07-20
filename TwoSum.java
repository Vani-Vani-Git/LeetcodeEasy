import java.util.Scanner;
public class TwoSum {
       public static int[] Solution(int[] Sums,int target) {
    	   for(int i =0;i<Sums.length-1;i++) {
    		   for(int j =i+1;j<Sums.length;j++) {
    			   if(Sums[i] + Sums[j] == target) {
    				   return new int[] {i,j};
    			   }
    		   }
    	   }
    	   return new int[] {};
       }
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("Enter Number of Elements");
    	   int n = sc.nextInt();
    	   System.out.println("Enter Numbers - ");
    	   int[] Sums = new int[n];
    	   for(int i=0;i<n;i++) {
    		   Sums[i] = sc.nextInt();
    	   }
    	   System.out.print("Enter a target value -");
    	   int target = sc.nextInt();
    	   int[] res = Solution(Sums, target);
    	   if(res.length == 2) {
    		   System.out.println("[" + res[0] + "," + res[1] + "]");
    	   }
    	   else {
    		   System.out.println("No Two Sum is Available");
    	   }
       }
}
