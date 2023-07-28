public class problem1662 {
    public static void main(String[] args) {
        String a = "ab", "c";

    }
    static boolean arraystringareEqual(String[] word1, String[] word2){

        String s1 = "";
        String s2 = "";
        for(int i=0;i< word1.length;i++){
            s1= s1+word1[i];
        }
        for(int j=0;j< word1.length;j++){
            s2= s2+word2[j];
        }
        return s1.equals(s2);
    }
}
