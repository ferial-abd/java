import java.util.*;

class TailleDuDernierMot {
    static ArrayList<Object> lastWordSize(String str) {
        ArrayList<Object> list = new ArrayList<>();
        String word = "";

        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ' ') break;
            word = str.charAt(i) + word;
        }

        list.add(word);
        list.add(str.length() - i - 1);

        return list;
    }

    public static void main(String[] args) {
        
	System.out.println (lastWordSize(""));}
	
       
}