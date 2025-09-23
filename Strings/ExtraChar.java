import java.util.*;

class ExtraChar{
    public static char findExtra(String s1, String s2){
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        
        int n = s1.length();
        for(int i = 0; i < n; i++){
            if(a1[i] != a2[i]){
                return a2[i];
            }
        }
        return a2[n];
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
