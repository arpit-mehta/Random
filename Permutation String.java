import java.util.*;

public class Main {

   static void solve(String str, List<String> ans, int index){
        if(index==str.length()){
            ans.add(str);
            return;
        }
        //swap everything from index till n-1
        for(int i=index ;i<str.length();i++){
            str=swap(i,index,str);
            solve(str,ans,index+1);
            //backtracking
            str=swap(i,index,str);
        }
    }
    private static String swap(int i ,int j , String str){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    public static List<String> permute(String str) {
        List<String> ans = new ArrayList<>();
        int index=0;
        solve(str,ans,index);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.next();
        System.out.println(permute(str));
    }
}
