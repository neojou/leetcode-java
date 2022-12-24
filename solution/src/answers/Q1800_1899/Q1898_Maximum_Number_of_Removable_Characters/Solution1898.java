package answers.Q1800_1899.Q1898_Maximum_Number_of_Removable_Characters;

import com.nj.algo.search.NJSearchAble;
import com.nj.algo.search.NJBinarySearch;
import com.nj.lang.NJString;

import java.util.Set;
import java.util.HashSet;

public class Solution1898 {


    class Removal implements NJSearchAble {
        final String s;
        final String p;
        final int[] removable;

        Removal(final String s, final String p, int[] removable) {
            this.s = s;
            this.p = p;
            this.removable = removable;
        }

        public boolean ifMeet(int k) {
            String s1;

            if (k == 0) return true;

            s1 = NJString.delAllPos(s, removable, k);
            boolean ret = NJString.isSubStrOf(p, s1);

            //// if (ret)
            ////    System.out.println("k=" + k + ": p=" + p + " is substring of s1=" + s1);
            //// else
            ////    System.out.println("k=" + k + ": p=" + p + " is NOT substring of s1=" + s1);
            return ret;
        }
    }

    public int maximumRemovals(String s, String p, int[] removable) {
        Removal rv = new Removal(s, p, removable);
        NJBinarySearch bs = new NJBinarySearch();
        int k = bs.biggestMeet(rv, 0, removable.length);
        return k;
    }
}
