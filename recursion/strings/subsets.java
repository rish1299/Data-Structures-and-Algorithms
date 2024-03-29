package strings;

import java.util.ArrayList;

public class subsets {
    /*
     * s="abc"
     */

    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        // recursive work
        char curr = s.charAt(0); // a
        ArrayList<String> smallAns = getSSQ(s.substring(1)); // ["bc","b","c",""]

        // ans= ["bc","b","c","","abc","ab","ac","a"]
        for (String ss : smallAns) {
            ans.add(ss); // ans= ["bc","b","c","",]
            // selfwork
            ans.add(curr + ss); // ans= ["abc","ab","ac","a"]

        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for (String ss : ans) {
            System.out.print(ss + " ");
        }

    }

}
