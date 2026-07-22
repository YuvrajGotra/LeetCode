class Solution {
    public String intToRoman(int nums) {
        String s = "";

        while (nums != 0) {
            if (nums >= 1000) {
                s += "M";
                nums -= 1000;
            }
            else if (nums >= 900) {
                s += "CM";
                nums -= 900;
            }
            else if (nums >= 500) {
                s += "D";
                nums -= 500;
            }
            else if (nums >= 400) {
                s += "CD";
                nums -= 400;
            }
            else if (nums >= 100) {
                s += "C";
                nums -= 100;
            }
            else if (nums >= 90) {
                s += "XC";
                nums -= 90;
            }
            else if (nums >= 50) {
                s += "L";
                nums -= 50;
            }
            else if (nums >= 40) {
                s += "XL";
                nums -= 40;
            }
            else if (nums >= 10) {
                s += "X";
                nums -= 10;
            }
            else if (nums >= 9) {
                s += "IX";
                nums -= 9;
            }
            else if (nums >= 5) {
                s += "V";
                nums -= 5;
            }
            else if (nums >= 4) {
                s += "IV";
                nums -= 4;
            }
            else {
                s += "I";
                nums -= 1;
            }
        }

        return s;
    }
}