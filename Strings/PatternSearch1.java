import java.util.*;

class PatternSearch1{
    public static void patSearch(String txt, String pat){
        int pos = txt.indexOf(pat);
        while(pos >= 0){
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text : ");
        String txt = sc.nextLine();
        System.out.print("Enter pattern : ");
        String pat = sc.nextLine();
        patSearch(txt, pat);
       
    }
}
