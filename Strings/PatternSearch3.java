import java.util.*;

class PatternSearch{
    public static char findExtra(String s1, String s2){
        if(s1.length() > s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        
        int res = 0;
        int n = s1.length();
        for(int i = 0; i < n; i++){
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        res = res ^ s2.charAt(n);
        return (char)(res);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char result = findExtra(s1, s2);
        System.out.println("Extra Character : " + result);
       sc.close();
    }
}
