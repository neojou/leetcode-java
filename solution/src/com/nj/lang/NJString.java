package com.nj.lang;

import java.lang.String;

public class NJString {

    public static boolean isSubStrOf(final String p, final String s) {
        int si = 0;
        int pi = 0;
        while ((si < s.length()) && (pi < p.length())) {
            char pc = p.charAt(pi);
            char sc = s.charAt(si);
            if (pc == sc) {
                pi++;
                si++;
                continue;
            }
            si++;
        }
        if (pi != p.length())
            return false;
        return true;
    }

    public static String delpos(final String str, int pos) {
        String left;
        String right;

        try {
            left = str.substring(0, pos);
        } catch (StringIndexOutOfBoundsException e) {
            left = "";
        }

        try {
            right = str.substring(pos + 1);
        } catch (StringIndexOutOfBoundsException e) {
            right = "";
        }

        return left + right;
    }

    public static String delAllPos(final String str, int[] removable, int k) {
        char[] charA = str.toCharArray();
        for (int i = 0; i < k; i++)
            charA[removable[i]] = '-';

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            if (charA[i] != '-')
                sb.append(charA[i]);

        return sb.toString();
    }
}