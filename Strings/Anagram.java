import java.util.*;

class Anagram{
    public static boolean areAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
           return false;
        }
        
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        
        return s1.equals(s2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean result = areAnagram(s1, s2);
        if(result == true){
            System.out.println("The given String Anagram");
        }else{
            System.out.println("The given String Not Anagram");
        }
       sc.close();
    }
}
