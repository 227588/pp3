public class C3 {
    public static boolean isAlphabet(String t){
        for (int i = 0; i < t.length()-1; i++) {
            if(t.charAt(i)>t.charAt(i+1))
                return false;
        }
        return true;
    }
    public static String hideText(String t){
        String newString = String.valueOf(t.charAt(0));
        for (int i = 0; i < t.length()-2; i++) {
            newString+="*";
        }
        newString+=t.charAt(t.length()-1);
        return newString;
    }
    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));
    }
}
