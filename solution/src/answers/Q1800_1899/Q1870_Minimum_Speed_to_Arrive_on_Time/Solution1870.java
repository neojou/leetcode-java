package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

public class Solution1870 {
    protected int oneSpeedOnTimeRange(final int[] dist, int last, int hour, int speed) {
        int last_speed;
        int max_time = last * 100;
        //System.out.println("last=" + last + ", hour=" + hour + ", speed=" + speed);
        if (hour < max_time)
            return -1;
        int time = hour - max_time;
        if (time == 0)
            return -1;
        //System.out.println("dist["+last+"]="+dist[last]);
        last_speed = (dist[last] + time - 1) / time;
        if (last_speed == 0)
            last_speed = 1;
        //System.out.println("last_speed=" + last_speed);
        if (last_speed > speed)
            speed = last_speed;
        if (last == 0)
            return speed;
        int new_hour_spend = (dist[last] + speed - 1)/speed;
        int last_time = hour - new_hour_spend;
        //System.out.println("last_time=" + last_time + ", max_time=" + max_time);
        return oneSpeedOnTimeRange(dist, last - 1,
                last_time, speed);
    }

    protected boolean checkSpeedOnTimeRange(final int[] dist, int cur, int hour, int speed) {
        if (cur >= dist.length)
            return true;
        //System.out.println("check cur=" + cur + ", hour=" + hour + ", speed=" + speed);
        //System.out.println("dist["+cur+"]="+dist[cur]);
        int spend = (dist[cur] + speed - 1)/speed;
        //System.out.println("check spend="+spend);
        if (spend > hour)
            return false;
        spend = ((spend + 100 - 1) / 100) * 100;
        int last_hour = hour - spend;
        //System.out.println("check last_hour="+last_hour);
        return checkSpeedOnTimeRange(dist, cur + 1,
                last_hour, speed);
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length < 1)
            return -1;
        int last = dist.length - 1;
        int hour100 = (int)(Math.round(hour * 100));
        for (int i = 0; i < dist.length; i++)
            dist[i] *= 100;
        int possible_speed = oneSpeedOnTimeRange(dist, last, hour100, 1);
        System.out.println("possible_speed="+possible_speed);
        int min_speed = possible_speed;
        for (int s = min_speed - 1; s > 1; s--) {
            if (checkSpeedOnTimeRange(dist, 0, hour100, s) == false)
                break;
            min_speed = s;
        }

        return min_speed;
    }
}