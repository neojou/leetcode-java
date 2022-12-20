package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

public class Solution1870 {
    int max_speed;

    protected boolean checkSpeedOnTimeRange(final int[] dist, int cur, double hour, int speed) {
        if (cur >= dist.length)
            return true;
        //System.out.println("check cur=" + cur + ", hour=" + hour + ", speed=" + speed);
        //System.out.println("dist["+cur+"]="+dist[cur]);
        double spend = (double)dist[cur] / (double)speed;
        //System.out.println("check spend="+spend);
        if (spend * 100 > Math.round(hour * 100))
            return false;
        spend = Math.ceil(spend);
        double last_hour = hour - spend;
        //System.out.println("check last_hour="+last_hour);
        return checkSpeedOnTimeRange(dist, cur + 1,
                last_hour, speed);
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
        if (checkSpeedOnTimeRange(dist, 0, hour, mid) == true)
            return minSpeedOnTimeRange(dist, hour, min_s, mid);
        return minSpeedOnTimeRange(dist, hour, mid, max_s);
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (normalization(dist, hour) == false)
            return -1;

        int last = dist.length - 1;

        //System.out.println("max_speed="+max_speed);
        if (checkSpeedOnTimeRange(dist, 0, hour, max_speed) == false)
            return -1;
        if (checkSpeedOnTimeRange(dist, 0, hour, 1) == true)
            return 1;

        return (int)minSpeedOnTimeRange(dist, hour, 1, max_speed);
    }
}