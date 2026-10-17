class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] sc =s.toCharArray(); 
        
        while(l<r){
            char ch1 = sc[l];
            char ch2 = sc[r];
            if(!(ch1=='A'||ch1 == 'E'||ch1 == 'I'||ch1 == 'O'||ch1 == 'U'||ch1 == 'a'||ch1 == 'e'||ch1 == 'i'||ch1 == 'o'||ch1 == 'u')){
                l++;
            }
            else if(!(ch2=='A'||ch2 == 'E'||ch2 == 'I'||ch2 == 'O'||ch2 == 'U'||ch2 == 'a'||ch2 == 'e'||ch2 == 'i'||ch2 == 'o'||ch2 == 'u')){
                r--;
            }
            else{
                char temp = sc[l];
                sc[l] = sc[r];
                sc[r] = temp;
                l++;
                r--;
            }

        }
        return String.valueOf(sc);
    }
}