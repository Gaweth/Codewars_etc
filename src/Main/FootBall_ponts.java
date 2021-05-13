package Main;

import java.util.Arrays;

public class FootBall_ponts {
    public static void main(String[] args) {

        System.out.println(TotalPoints.points(new String[]{"3:3"}));
    }

    public class TotalPoints {

        public static int points(String[] games) {
            int total = 0;
            for(String s : games){
                int x = Integer.parseInt(s.split(":",2)[0],10);
                int y = Integer.parseInt(s.split(":",2)[1], 10);
                if(x > y){ total += 3;}
                if(x == y){ total += 1;}
            }
            return total;
        }
    }
}
