public class stringuppercase {
    static String toUpper(String s1){
        if (s1.length()<=3) {
            return s1.toUpperCase();
        }
        StringBuffer str = new StringBuffer(s1);
        str.replace(str.length()-3, str.length(), s1.substring(s1.length()-3).toUpperCase());
        // for (int i = str.length()-4; i < str.length()-1; i++) {
        //     str.setCharAt(i, str.;
        // }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println("Hello World: "+toUpper("Hello World"));
        System.out.println("men: "+toUpper("men"));
    }
}
