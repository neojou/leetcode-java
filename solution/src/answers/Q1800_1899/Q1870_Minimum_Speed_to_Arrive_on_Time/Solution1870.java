package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;


public class Solution1870 {
    int max_speed;

    protected boolean normalization(final int[] dist, final double hour) {
        if ((dist == null) || (dist.length < 1))
            return false;

        int len = dist.length;
        max_speed = 1;
        for (int i = 0; i < len - 1; i++) {
            if (dist[i] > max_speed)
                max_speed = dist[i];
        }
        int speed = (int)( Math.ceil(dist[len - 1] / (hour - len + 1)));
        if (speed > max_speed)  max_speed = speed;

        return true;
    }

    protected boolean checkSpeedOnTime(final int[] dist,
                                       final double hour, final int speed) {
        double res = 0;
        double spend;
        int i = 0;

        for (; i < dist.length - 1; i++) {
            spend = (double) dist[i] / (double) speed;
            res += Math.ceil(spend);
        }
        spend = (double) dist[i] / (double) speed;
        res += spend;
        return res <= hour;
    }

    protected int minSpeedOnTimeRange(final int[] dist, final double hour,
                                      final int left, final int right) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        if (checkSpeedOnTime(dist, hour, mid) == true)
            return minSpeedOnTimeRange(dist, hour, left, mid);
        return minSpeedOnTimeRange(dist, hour, mid + 1, right);
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (normalization(dist, hour) == false)
            return -1;

        if (checkSpeedOnTime(dist, hour, 1) == true)
            return 1;

        if (checkSpeedOnTime(dist, hour, max_speed) == false)
            return -1;

        return minSpeedOnTimeRange(dist, hour, 1, max_speed);
    }
}