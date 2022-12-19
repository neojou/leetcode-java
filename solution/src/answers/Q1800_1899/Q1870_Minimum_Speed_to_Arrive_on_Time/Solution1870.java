package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

public class Solution1870 {
    int hour100;
    int[] distA;
    int max_speed;

    public static int align(int num, int base) {
        // Calculate the next multiple of the base that is equal to or greater than the given number
        return (num + base - 1) - ((num + base - 1) % base);
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
        spend = align(spend, 100);
        int last_hour = hour - spend;
        //System.out.println("check last_hour="+last_hour);
        return checkSpeedOnTimeRange(dist, cur + 1,
                last_hour, speed);
    }

    protected boolean normalization(int[] dist, double hour) {
        // parameter check
        // hour100
        hour100 = (int)(Math.round(hour * 100));

        // distA
        distA = dist;
        if ((distA == null) || (distA.length < 1))
            return false;
        for (int i = 0; i < dist.length; i++)
            dist[i] *= 100;

        // max_speed
        max_speed = 1;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] > max_speed)
                max_speed = dist[i];
        }
        return true;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (normalization(dist, hour) == false)
            return -1;

        int last = dist.length - 1;

        int min_speed = max_speed;
        System.out.println("max_speed="+max_speed);
        if (checkSpeedOnTimeRange(dist, 0, hour100, max_speed) == false)
            return -1;

        /* Should change to binary search here */
        for (int s = max_speed - 1; s > 0; s--) {
            if (checkSpeedOnTimeRange(dist, 0, hour100, s) == false)
                break;
            min_speed = s;
            //System.out.println("min_speed="+min_speed);
        }

        return min_speed;
    }
}