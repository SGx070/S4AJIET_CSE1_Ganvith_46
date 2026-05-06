public class Main {
    public static void main(String[] args) {
        StringBuilder r = new StringBuilder();
        String s = "a3b4d5";
        for(int i =0;i<s.length();i+=2){
            char ch = s.charAt(i);
            int c = Character.getNumericValue(s.charAt(i+1));
            for(int m=0;m<c;m++)
                r.append(ch);
        
        }System.out.println(r);
    }
}
