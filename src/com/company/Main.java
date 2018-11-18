package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] testNums = {2, 7, 11, 15};
//        int target = 9;
//
//        TwoSum testFunc = new TwoSum();
//
//        System.out.println(testFunc.twoSum(testNums, target));

        NextClosestTime closestTime= new NextClosestTime();
        String time = "01:32";

        System.out.println("result: " + closestTime.nextClosestTime(time));


    }
}
