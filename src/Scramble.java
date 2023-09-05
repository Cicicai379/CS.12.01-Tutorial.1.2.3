import java.util.ArrayList;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        String ans = "";
        int i=0;
        while(i<word.length()-1){
            if(word.charAt(i)=='A' && word.charAt(i+1)!='A'){
                ans += word.charAt(i+1);
                ans += word.charAt(i);
                i++;
            }else{
                ans+= word.charAt(i);
            }
            i++;
        }
        if(ans.length()!=word.length()) ans+=word.charAt(word.length()-1);
        return ans;
    }
    public static void scrambleOrRemove(List<String> word) {
        List<String> modifiedWords = new ArrayList<>();

        for (String e : word) {
            if (!Scramble.scrambleWord(e).equals(e)) {
                modifiedWords.add(Scramble.scrambleWord(e));
            }
        }

        word.clear();
        word.addAll(modifiedWords);
    }

}
