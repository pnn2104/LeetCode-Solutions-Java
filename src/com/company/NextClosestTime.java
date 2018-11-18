package com.company;

import java.util.HashMap;
import java.util.Map;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        String result = "";
        int minutes = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
        System.out.println(minutes);
        int smallest = Character.getNumericValue(time.charAt(0));
        Map<Character, Boolean> hash = new HashMap<>();


        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) != ':') {
                hash.put(time.charAt(i), true);
                smallest = Math.min(smallest, Character.getNumericValue(time.charAt(i)));
            }
        }

        while (minutes <= 24 * 60) {
            minutes++;
            String hr = Integer.toString((int) Math.floor(minutes / 60));
            String min =  minutes % 60 + "";
            if (hr.length() != 2) {
                hr = "0" + hr;
            }
            if (min.length() != 2) {
                min = "0" + min;
            }
            if (hash.containsKey(hr.charAt(0)) &&
                    hash.containsKey(hr.charAt(1)) &&
                    hash.containsKey(min.charAt(0)) &&
                    hash.containsKey(min.charAt(1))) {
                result = hr + ":" + min;
                System.out.println(result);
                break;
            }
        };

        System.out.println(result.length() > 0);

        return result.length() > 0 ? result : ("" + smallest + "" + smallest + ":" + "" + smallest + "" + smallest);
    }
}
