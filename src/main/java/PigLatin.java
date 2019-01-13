public class PigLatin {
    public static String pigIt(String str) {
        String result = "";
        for(String word: str.split(" ")) {
            if(word.length() == 1){
                result += word + (Character.isLetter(word.charAt(0)) ? "ay " : " ");
            } else
                result += word.substring(1) + word.charAt(0) + "ay ";
        }
        return result.trim();
    }
}