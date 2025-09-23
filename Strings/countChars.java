/*Function to count number of characters
 * to make s1 and s2 equal
 * s1 : first string
 * s2 : second string
 */
class Geeks {

    static int countChars(String s1, String s2) {

        // Your code here
        int[] freq = new int[26];
        
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }
        
        for(char c : s2.toCharArray()){
            freq[c - 'a']--;
        }
        
        int delete = 0;
        for(int diff : freq){
            delete += Math.abs(diff);
        }
        return delete;
    }
}
