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
        
        
  String s1= "kajak";
    StringBuilder sb = new StringBuilder(s1);
    if (s1.equals(sb.reverse().toString())){
        //System.out.println("tak");
    }

    String s2 = "kajagk";
    if (s2.equals(new StringBuilder(s2).reverse().toString())){
        System.out.println("tak");
    }
        System.out.println("nie");

    }


    public static boolean palindrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;

    }

}

