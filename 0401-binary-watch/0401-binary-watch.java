class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();

        for(int hours = 0; hours < 12; hours++) {
            for(int min = 0; min < 60; min++) {
                int cnt = Integer.bitCount(hours) + Integer.bitCount(min);

                if(turnedOn == cnt) {
                    String time = hours + ":";

                    if(min < 10) {
                        time += "0";
                    }

                    time += min;

                    res.add(time);
                }
            }
        }

        return res;
    }
}