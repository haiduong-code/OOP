import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int maxx = 1;
        for (int i = 0; i < str.length() -1; i++) {
            int count = 1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }else{
                    break;
                }
            }
            if (count > maxx) {
                maxx = count;
            }
        }
        return maxx;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {

        int l = str.length();
        String moi = "";

        for (int i=0;i<l;++i){
            if (str.charAt(i) >= '1' && str.charAt(i)<='9'){
                for ( char j='1'; j<= str.charAt(i) ;++j){
                    moi += str.charAt(i+1);
                }
            }else{
                moi += str.charAt(i);
            }

        }
        return moi;
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        for (int i = 0; i < a.length()-len; i++) {
           String s="";
           for (int j = i; j < i+len; j++) {
               s+=a.charAt(j);
           }
           if (b.contains(s)){
               return true;
           }
        }
        return false;
    }

}
