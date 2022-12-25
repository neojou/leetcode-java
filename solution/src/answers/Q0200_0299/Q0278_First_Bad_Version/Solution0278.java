package answers.Q0200_0299.Q0278_First_Bad_Version;

import com.nj.algo.search.NJSearchAble;
import com.nj.algo.search.NJBinarySearch;

public class Solution0278 {
    public class BadVersion implements NJSearchAble {
        int last;

        private boolean isBadVersion(int version) {
            if (version < 4) return false;
            return true;
        }

        public BadVersion(int n) {
            last = n;
        };

        public boolean ifMeet(int k) {
            if (k >= last) return false;
            if (k < 1) return true;
            return !isBadVersion(k);
        }
    }

    public int firstBadVersion(int n) {
        BadVersion bv = new BadVersion(n);
        NJBinarySearch bs = new NJBinarySearch();
        int k = bs.biggestMeet(bv, 0, n);
        return (k + 1);
    }
}

