package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

public class Solution1870 {
    int max_speed;

    protected boolean checkSpeedOnTime(final int[] dist, double hour, int speed) {
        double res = 0;
        double spend;
        int i = 0;

        for (; i < dist.length - 1; i++) {
            spend = (double) dist[i] / (double) speed;
            res += Math.ceil(spend);
        }
        spend = (double) dist[i] / (double) speed;
        res += spend;
        return (res * 1000 > Math.round(hour * 1000) ? false : true);
    }

    protected boolean normalization(int[] dist, double hour) {
        // parameter check
        // distA
        if ((dist == null) || (dist.length < 1))
            return false;

        // max_speed
        max_speed = 1;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] > max_speed)
                max_speed = dist[i] * 100;
        }
        return true;
    }

    protected long minSpeedOnTimeRange(final int[] dist, final double hour, int min_s, int max_s) {
        int mid = (min_s + max_s) / 2;
        if (mid == min_s)
            return max_s;
        if (checkSpeedOnTime(dist, hour, mid) == true)
            return minSpeedOnTimeRange(dist, hour, min_s, mid);
        return minSpeedOnTimeRange(dist, hour, mid, max_s);
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (normalization(dist, hour) == false)
            return -1;

        int last = dist.length - 1;

        //System.out.println("max_speed="+max_speed);
        if (checkSpeedOnTime(dist, hour, max_speed) == false)
            return -1;
        if (checkSpeedOnTime(dist, hour, 1) == true)
            return 1;

        return (int)minSpeedOnTimeRange(dist, hour, 1, max_speed);
    }
}