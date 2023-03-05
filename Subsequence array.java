import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int n=3;
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsequence(0,ans,arr,n);
    }

    private static void printSubsequence(int index, ArrayList<Integer> ans, int[] arr, int n) {
        if(index==n){
            for (Integer ele: ans) {
                System.out.print(ele+" ");
            }
            System.out.println();
            return;
        }
        //take or pick a particular index into subsequence
        ans.add(arr[index]);
        printSubsequence(index+1,ans,arr,n);
        ans.remove(ans.size()-1); //while going back we also have to remove the added element

        printSubsequence(index+1,ans,arr,n);
    }


}
