package Main;

public class palindrom {
    public static void main(String[] args) {

//        System.out.println(Solution.palindrom("kajfdg"));
//        System.out.println(Solution.palindrom("kajak kajak"));
//        System.out.println(Solution.palindrom("oko w oko"));
//        System.out.println(Solution.palindrom("teet"));
//        System.out.println(Solution.palindrom("dfgdgfs"));

//
//        System.out.println(palindrom("kajak") + " \n" + palindrom("ddgf") + " \n" + palindrom("oko w oko"));
//        System.out.println(palindrom("afsdf"));
//        System.out.println(palindrom("fafsdf"));

    }


    public static boolean palindrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;

    }

}

