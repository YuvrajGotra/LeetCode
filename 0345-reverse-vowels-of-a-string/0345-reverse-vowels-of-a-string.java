class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        char[] arr = s.toCharArray();

        while(i <= j) {
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j)) ) {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++; j--;
                s = new String(arr);
            }
            else if(!isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                i++;
            }
            else j--;
        }

        return s;
    }

    public boolean isVowel(char s) {
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U' ) return true;
        return false;
    }
}