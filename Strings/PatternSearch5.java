class Geeks {
    static int follPatt(String s) {
        // Your code here
        int n = s.length();
        int i = 0;
        
        while(i < n){
            int countX = 0, countY = 0;
            
            if(i < n && s.charAt(i) == 'x'){
            while(i < n && s.charAt(i) == 'x'){
                countX++;
                i++;
            }
            }else{
                return 0;
            }
            while(i < n && s.charAt(i) == 'y'){
                countY++;
                i++;
            }
            if(countX != countY){
                return 0;
            }
        }
        return 1;
    }
}
