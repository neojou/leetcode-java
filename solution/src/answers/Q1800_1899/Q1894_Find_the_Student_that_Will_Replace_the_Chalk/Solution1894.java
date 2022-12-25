package answers.Q1800_1899.Q1894_Find_the_Student_that_Will_Replace_the_Chalk;


import com.nj.algo.search.NJIntArraySearch;
import com.nj.algo.search.NJLongArraySearch;

public class Solution1894 {


    public int chalkReplacer(int[] chalk, int k) {

        // normalize
        int len = chalk.length;
        long[] chalk_acum = new long[len];
        chalk_acum[0] = chalk[0];
        for (int i = 1; i < len; i++)
            chalk_acum[i] = chalk_acum[i - 1] + chalk[i];
        long total = chalk_acum[len - 1];
        long rest = (long)k % total;

        NJLongArraySearch ias = new NJLongArraySearch(chalk_acum);
        int pos = ias.findPosToInsert(rest);
        if (chalk_acum[pos] == rest)
            return (pos + 1);
        return pos;
    }

}