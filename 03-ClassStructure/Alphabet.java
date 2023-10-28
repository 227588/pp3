public class Alphabet {
    static public boolean isAlphabet(String phrase){
        for(int i=0; i<phrase.length()-1; i++){
            if((int)phrase.charAt(i)>(int)(phrase.charAt(i+1)))
                return false;
            }
        return true;
    }
}
