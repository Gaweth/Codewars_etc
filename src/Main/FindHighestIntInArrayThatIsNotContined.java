package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindHighestIntInArrayThatIsNotContined {
    public static void main(String[] args) {
        FindHighestIntInArrayThatIsNotContined find = new FindHighestIntInArrayThatIsNotContined();
        System.out.println(find.solution(new int[]{1, 213, 56, 4987, 32, 66, 45,}));

    }

    public int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        for (int i = 1; i <= 100*1000+1; i++) {
            if (!set.contains(i)){
                return i;
            }

        }
        return 0;
    }
}
