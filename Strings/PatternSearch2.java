import java.util.*;

class PatternSearch2{
    public static String digitsAfterDecimal(String no){
        int pos = no.indexOf('.');
        if(pos < 0){
            return "";
        }else{
            return no.substring(pos+1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        String no = sc.nextLine();
        
        String result = digitsAfterDecimal(no);
        
        if(result.isEmpty()){
            System.out.println("No decimal point found");
        }else{
            System.out.println("Digits after decimal : " + result);
        }
       sc.close();
    }
}
