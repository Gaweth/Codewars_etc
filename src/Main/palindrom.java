package Main;

public class palindrom {
    public static void main(String[] args) {

        System.out.println(Solution.palindrom("kajfdg"));
        System.out.println(Solution.palindrom("kajak kajak"));
        System.out.println(Solution.palindrom("oko w oko"));
        System.out.println(Solution.palindrom("teet"));
        System.out.println(Solution.palindrom("dfgdgfs"));
    }

    class Solution {
        public static boolean palindrom(String str) {

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(0) == str.charAt(str.length() - 1))
                    return true;
                }
            return false;

            }
        }
    }
