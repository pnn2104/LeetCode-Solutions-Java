package com.company;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int maxDistance = 0;
        int lastSeated = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1 && lastSeated == -1) {
                lastSeated = i;
                maxDistance = Math.max(maxDistance, lastSeated - 0);
            } else if (seats[i] == 1 && lastSeated != -1) {
                maxDistance = Math.max(maxDistance, (int) Math.floor((i - lastSeated) / 2));
                lastSeated = i;
            }
        }
        return Math.max(maxDistance, seats.length - 1 - lastSeated);
    }
}
